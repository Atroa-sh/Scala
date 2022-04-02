package p1 {
  class A1T { new A1B }
  package p2 {
    class A2T { new A2B; new A1T; new A1B }
    package p3 {
      class A3 { new A2T; /* new A2B; */ new A1T; /* new A1B */ }
    }
    class A2B { /* new A2T; new A1T; new A1B */ }
  }
  class A1B {  new A1T  }
}

object Appl {
  def main(args: Array[String]) {
    new p1.A1T
    new p1.A1B
    new p1.p2.A2T
    new p1.p2.A2B
    new p1.p2.p3.A3
  }
}
/*po odkomentowaniu bytecode ulegl zmianie, poprzednia sekcja L1 byla teraz oznaczona jako L2 a "nowe" L1 opisywalo obiekt
dodatkowo wartosc MAXSTACK zmienila wartosc z 1 na 2. Niestety nie jestem w stanie zinterpretowac tych zmian
procz intuicji ze nowa sekcja L1 opisuje tworzenie classy AT1
* */