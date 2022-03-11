# Plot Factories
**Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

Implement [`com.epam.rd.autocode.factory.plot.PlotFactories`](src/main/java/com/epam/rd/autocode/factory/plot/PlotFactories.java) methods:
- `classicDisneyPlotFactory` - returns a factory that creates a plot for a classic Disney animated film.
- `contemporaryDisneyPlotFactory` - returns a factory that creates a plot for a contemporary Disney animated film.
- `marvelPlotFactory` - returns a factory that creates a plot for a Marvel movie.

API Details:
- `Character` interface.\
  Represents a plot character. Has the `name()` method, that returns its name.
- `EpicCrisis` interface.\
  Represents an epic crisis. Has the `name()` method, that returns its name.
- `Plot` interface.\
  Represents a plot. Has `asText()` method, that returns the text of the plot.
- `PlotFactory` interface.\
  Represents a plot factory. Produces plots via the `plot()` method.

## Examples

```java
PlotFactories factories = new PlotFactories();

PlotFactory mermaidPlotFactory = factories.classicDisneyPlotFactory(
() -> "Ariel",
() -> "Eric",
() -> "Ursula");

PlotFactory beautyAndTheBeastPlotFactory = factories.classicDisneyPlotFactory(
() -> "Belle",
() -> "Beast",
() -> "Gaston");

PlotFactory lionKingPlotFactory = factories.classicDisneyPlotFactory(
() -> "Simba",
() -> "Nala",
() -> "Scar");

System.out.println(mermaidPlotFactory.plot().asText());
System.out.println(beautyAndTheBeastPlotFactory.plot().asText());
System.out.println(lionKingPlotFactory.plot().asText());
```

> Ariel is young and adorable. Ariel and Eric love each other. Ursula interferes with their happiness, but loses in the end.
> 
> Belle is young and adorable. Belle and Beast love each other. Gaston interferes with their happiness, but loses in the end.
> 
> Simba is young and adorable. Simba and Nala love each other. Scar interferes with their happiness, but loses in the end.

---
```java
PlotFactories factories = new PlotFactories();

PlotFactory mulanPlotFactory = factories.contemporaryDisneyPlotFactory(
() -> "Mulan",
() -> "Hun invasion",
() -> "little dragon Mushu");

PlotFactory frozenPlotFactory = factories.contemporaryDisneyPlotFactory(
() -> "Anna",
() -> "her sister Elsa is overwhelmed by her magical powers",
() -> "snowman Olaf");

PlotFactory moanaPlotFactory = factories.contemporaryDisneyPlotFactory(
() -> "Moana",
() -> "a blight strikes the island",
() -> "shape-shifting demigod Maui");

System.out.println(mulanPlotFactory.plot().asText());
System.out.println(frozenPlotFactory.plot().asText());
System.out.println(moanaPlotFactory.plot().asText());
```

> In the beginning, Mulan feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - Hun invasion. Mulan stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny little dragon Mushu, Mulan restores the spirit, overcomes the crisis and gains gratitude and respect.
> 
> In the beginning, Anna feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - her sister Elsa is overwhelmed by her magical powers. Anna stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny snowman Olaf, Anna restores the spirit, overcomes the crisis and gains gratitude and respect.
> 
> In the beginning, Moana feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - a blight strikes the island. Moana stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny shape-shifting demigod Maui, Moana restores the spirit, overcomes the crisis and gains gratitude and respect.

---
```java
PlotFactories factories = new PlotFactories();

PlotFactory ironManPlotFactory = factories.marvelPlotFactory(
        new Character[]{() -> "Iron Man"},
        () -> "Ten Rings is about to access Stark Industries technologies and that",
        () -> "Obadiah Stane");
PlotFactory avengersPlotFactory = factories.marvelPlotFactory(
        new Character[]{() -> "Iron Man", () -> "Captain America", () -> "Hulk", () -> "Thor", () -> "Black Widow", () -> "HawkEye"},
        () -> "Chitauri Invasion",
        () -> "Loki");
PlotFactory guardiansOfTheGalaxyPlotFactory = factories.marvelPlotFactory(
        new Character[]{() -> "Star-Lord", () -> "Gamora", () -> "Drax", () -> "Groot", () -> "Rocket"},
        () -> "Kree Invasion",
        () -> "Ronan the Accuser");

System.out.println(ironManPlotFactory.plot().asText());
System.out.println(avengersPlotFactory.plot().asText());
System.out.println(guardiansOfTheGalaxyPlotFactory.plot().asText());
```

> Ten Rings is about to access Stark Industries technologies and that threatens the world. But the brave Iron Man is on guard. So, no way that intrigues of Obadiah Stane will bend the willpower of the inflexible hero.
> 
> Chitauri Invasion threatens the world. But the brave Iron Man, the brave Captain America, the brave Hulk, the brave Thor, the brave Black Widow and the brave HawkEye are on guard. So, no way that intrigues of Loki will bend the willpower of inflexible heroes.
> 
> Kree Invasion threatens the world. But the brave Star-Lord, the brave Gamora, the brave Drax, the brave Groot and the brave Rocket are on guard. So, no way that intrigues of Ronan the Accuser will bend the willpower of inflexible heroes.