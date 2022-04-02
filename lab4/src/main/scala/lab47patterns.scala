def printContInfo(c: Any) = c match {
  case 1     => println("1 matched")
  case 1.1   => println("1.1 matched")
  case 1.1f  => println("1.1f matched")
  case "42"  => println("'42' matched")
  case true  => println("true matched")
  case false => println("false matched")
  case ()    => println("() matched")
  case 40l   => println("40l matched")
  case 'a'   => println("'a' matched")
  case _     => println("Unknown const")
}

def printContInfo(c: Any) = c match {
  case 1     => println("1 matched")
  case 1.1   => println("1.1 matched")
  case 1.1f  => println("1.1f matched")
  case "42"  => println("'42' matched")
  case true  => println("true matched")
  case false => println("false matched")
  case ()    => println("() matched")
  case 40l   => println("40l matched")
  case 'a'   => println("'a' matched")
  case ()    => println("() matched")
  case any   =>
    println("Variable pattern matched, matched: " + any)
}
// nie wpasowujace sie w wczesniejsze case'y trafiaja teraz do any => ...

def printContInfo(c: Any) = c match {
  case any =>
    println("Variable pattern matched, matched: " + any)
  case 1     => println("1 matched")
  case 1.1   => println("1.1 matched")
  case 1.1f  => println("1.1f matched")
  case "42"  => println("'42' matched")
  case true  => println("true matched")
  case false => println("false matched")
  case ()    => println("() matched")
  case 40l   => println("40l matched")
  case 'a'   => println("'a' matched")
  case ()    => println("() matched")
}

// wszystkie case'y sa przysloniete przez any => ... przez co do reszty z nich program nie dotrze

