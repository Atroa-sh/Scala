object Appl {
  def main(args: Array[String]): Unit = {
    val wyr1 = "a" :: "bb" :: "ccc" :: "dddd" :: Nil
    val wyr2 = ("a" :: ("bb" :: ("ccc" :: ("dddd" :: Nil))))
    val wyr3 = Nil.::("dddd").::("ccc").::("bb").::("a")
    val wyr4 = List("a", "bb", "ccc", "dddd")
    val wyr5 = new ::("a", List("bb", "ccc", "dddd"))

    val wyr6 = "dddd" :: Nil
    val wyr7 = "ccc" :: wyr6
    val wyr8 = "bb" :: wyr7
    val wyr9 = "a" :: wyr8

    val wyr10 = Nil.::("dddd")
    val wyr11 = wyr10.::("ccc")
    val wyr12 = wyr11.::("bb")
    val wyr13 = wyr12.::("a")

    val wyr14 = new ::("dddd" , Nil)
    val wyr15 = new ::("ccc" , wyr14)
    val wyr16 = new ::("bb" , wyr15)
    val wyr17 = new ::("a" , wyr16)

    val first100DivBy3 = for (i <- (1 to 1000).toList if i % 3 == 0 && i/3<=100) yield i
    first100DivBy3.head
    first100DivBy3.tail.head
    first100DivBy3.last

    val desc20to100 = for ( i <- (20 to 100).toList if i % 2 == 0) yield i
    val desc100to20 = desc20to100.reverse
    //lengthOf(desc100to20)


    val namesStr = "tomasz, t, bogdan, anna, Jerzy, j, maria"
    val formStr = namesStr
      .split(",[ ]+")
      .filter(_.length > 1)
      .map(_.capitalize)
      .reduce(_ + "," + _)
    //1. split odziela wyrazy i wrzyca do array na podstawie danych znakow (tutaj dla ,)
    //2. filtruje wyrzucajac wyrazy krotsze niz 2
    //3. capitalize kazdemu wyrazowi piersza litere zaminia na duza
    //4. reduce dodaje kolejne wyrazy do siebie z przecinkami pomiedzy

    val numOfDiffLetters = List("Trzynastu", "musi", "pójść")
      .mkString
      .toLowerCase
      .toSet
      .size
    //1. mkString skleja i tworzy string
    //2. lowercase zmnijsza piersza litere stringa na mala
    //3. toSet zmienia string na nieuporzadkowany set
    //4. size zwraca liczbe elementow w  secie

    val prodPrices = Map("A" -> 100, "B" -> 500, "C" -> 1000)
    val products = List("A", "B", "C")
    val totalDiscount = products
      .filter(prodPrices(_) > 499)
      .map(e => { val pr = prodPrices(e)
        if (pr > 999) pr * 0.3 else pr * 0.1 })
      .reduce(_ + _)

    //1. filter pozbywa sie z Mapy A bo jej wartosc jest mniejsza niz 499
    //2. zwraca w zaleznosci od if. jesli cena >999 to zwraca 30% ceny jesli nie to 10% ceny
    //reduce sumuje do siebie znizki

    val lines = List("This is a line of text",
      "And here the second line")
    val wordCound1 = lines
      .flatMap(_.split(" "))
      .map(_.toLowerCase)
      .foldLeft(0)((acc, e) => acc + 1)

    val wordCound2 = lines
      .flatMap(_.split(""))
      .map(_.toLowerCase)
      .toSet.foldLeft(0)((acc, e) => acc + 1)

    //wordc1
    //1. split rozdziela po spacjach i pakuje do listy
    //2. lowercase zmniejsza na mala litere 1 litere
    //3. fold left dodaje do akumulatora dla kazdego wyrazu 1 i zwraca liczbe wyrazow

    //wordc2
    //1. split rozdziela po niczym wiec rozdziala na pojedyncze znaki
    //2. lowercase zmniejsza na mala litere 1 litere
    //3. to set zmienia na set przez co duplikaty liter z listy znikaja
    //4. fold zlicza do akumulatora liczba elementow w secie

    val wordCound1slash = {

      (0 /: lines
        .flatMap(_.split(" "))
        .map(_.toLowerCase).map(_ => 1)) (_+_)

    }

    val wordCound2slash = {

      (0 /: lines
        .flatMap(_.split(""))
        .map(_.toLowerCase)
        .toSet
        .toArray
        .map(_ => 1)) (_+_)

    }

  }
}
