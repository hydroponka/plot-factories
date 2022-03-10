# Plot Factories
**Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

Implement [`com.epam.rd.autocode.factory.plot.PlotFactories`](src/main/java/com/epam/rd/autocode/factory/plot/PlotFactories.java) methods:
- `classicDisneyPlotFactory` - returns a factory that creates a plot for a classic Disney animated film.
- `contemporaryDisneyPlotFactory` - returns a factory that creates a plot for a contemporary Disney animated film.
- `marvelPlotFactory` - returns a factory that creates a plot for a Marvel movie.

Examples:

```java
PlotFactory mermaidPlotFactory = factories.classicDisneyPlotFactory(
                () -> "Ariel",
                () -> "Eric",
                () -> "Ursula");
System.out.println(mermaidPlotFactory.plot().toString());
```

> Ariel is great. Ariel and Eric love each other. Ursula interferes with their happiness but loses in the end.

---

```java
PlotFactory moanaPlotFactory = factories.contemporaryDisneyPlotFactory(
        () -> "Moana",
        () -> "a blight strikes the island",
        () -> "shape-shifting demigod Maui");
System.out.println(moanaPlotFactory.plot().toString());
```

> Moana feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - a blight strikes the island. Moana stands up against it, but with no success at first. But putting self together and help of friends, including spectacular funny shape-shifting demigod Maui restore the spirit and Moana overcomes the crisis and gains gratitude and respect.

---
```java
PlotFactory guardiansOfTheGalaxyPlotFactory = factories.marvelPlotFactory(
        new Character[]{() -> "Star-Lord", () -> "Gamora", () -> "Drax", () -> "Groot", () -> "Rocket"},
        () -> "Kree Invasion",
        () -> "Ronan the Accuser");
System.out.println(guardiansOfTheGalaxyPlotFactory.plot().toString());
```

>Kree Invasion threatens the world. But the brave Star-Lord, the brave Gamora, the brave Drax, the brave Groot and the brave Rocket are on guard. So, no way that intrigues of Ronan the Accuser overcome the willpower of inflexible heroes.
