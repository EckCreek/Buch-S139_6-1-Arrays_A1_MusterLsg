class Main {
  // Muster-Loesung der Aufgabe 1 auf S. 139 
  static int[] wuerfelergebnisse = new int[6];
  // A1-c
  static int[] simulation = new int[30];

  // A1-b
  public static void arrayFuellen() {
    // EKB In der  Abbruchbedingung der Schleife die konstante Zahl 6 durch wuerfelergebnisse.length ersetzen
    for (int i = 0; i < 6; i++) {
      wuerfelergebnisse[i] = i + 1;
    }
  }

  // A1-c
  public static void wuerfelsimulation() {
    for (int i = 0; i < simulation.length; i++) {
      simulation[i] = (int) (Math.random() * 6 + 1);
    }
  }

  // A1-e
  public static int summe() {
    int summe = 0;
    for (int i = 0; i < 30; i++) {
      summe = summe + simulation[i];
    }
    return summe;
  }
  // A1-e
  public static double durchschnitt() {
    return summe() / 30.0;
  }

  public static void main(String[] args) {
    System.out.println("Musterloesung der Aufgabe 1 auf S. 139");
    arrayFuellen();
    wuerfelsimulation();
    for (int i = 0; i < 6; i++) {
      System.out.println(wuerfelergebnisse[i]);
    }
    // A1-d
    System.out.println("Die Würfelsimulation:");
    for (int i = 0; i < simulation.length; i++) {
      System.out.println("Wurf " + (i+1) + " ergab " + simulation[i]);
    }
  // Nur zur Veranschaulichung
    System.out.println("");
    System.out.println("Die Summe aller Würfe der Würfelsimulation: " + summe());
    System.out.println("Der Durchschnitt aller Würfe der Würfelsimulation: " + durchschnitt());
  }
}