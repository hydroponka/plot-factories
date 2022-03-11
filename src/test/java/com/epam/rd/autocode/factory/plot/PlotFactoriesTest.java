package com.epam.rd.autocode.factory.plot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlotFactoriesTest {
    private final PlotFactories factories = new PlotFactories();

    @Test
    public void classicDisneyPlotFactory() {

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

        assertEquals(
                "Ariel is young and adorable. Ariel and Eric love each other. Ursula interferes with their happiness, but loses in the end.",
                mermaidPlotFactory.plot().asText()
        );
        assertEquals(
                "Belle is young and adorable. Belle and Beast love each other. Gaston interferes with their happiness, but loses in the end.",
                beautyAndTheBeastPlotFactory.plot().asText()
        );
        assertEquals(
                "Simba is young and adorable. Simba and Nala love each other. Scar interferes with their happiness, but loses in the end.",
                lionKingPlotFactory.plot().asText()
        );
    }

    @Test
    public void contemporaryDisneyPlotFactory() {
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

        assertEquals(
                "In the beginning, Mulan feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - Hun invasion. Mulan stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny little dragon Mushu, Mulan restores the spirit, overcomes the crisis and gains gratitude and respect.",
                mulanPlotFactory.plot().asText()
        );
        assertEquals(
                "In the beginning, Anna feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - her sister Elsa is overwhelmed by her magical powers. Anna stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny snowman Olaf, Anna restores the spirit, overcomes the crisis and gains gratitude and respect.",
                frozenPlotFactory.plot().asText()
        );
        assertEquals(
                "In the beginning, Moana feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - a blight strikes the island. Moana stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny shape-shifting demigod Maui, Moana restores the spirit, overcomes the crisis and gains gratitude and respect.",
                moanaPlotFactory.plot().asText()
        );
    }

    @Test
    public void marvelPlotFactory() {
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

        assertEquals(
                "Ten Rings is about to access Stark Industries technologies and that threatens the world. But the brave Iron Man is on guard. So, no way that intrigues of Obadiah Stane will bend the willpower of the inflexible hero.",
                ironManPlotFactory.plot().asText()
        );
        assertEquals(
                "Chitauri Invasion threatens the world. But the brave Iron Man, the brave Captain America, the brave Hulk, the brave Thor, the brave Black Widow and the brave HawkEye are on guard. So, no way that intrigues of Loki will bend the willpower of inflexible heroes.",
                avengersPlotFactory.plot().asText()
        );
        assertEquals(
                "Kree Invasion threatens the world. But the brave Star-Lord, the brave Gamora, the brave Drax, the brave Groot and the brave Rocket are on guard. So, no way that intrigues of Ronan the Accuser will bend the willpower of inflexible heroes.",
                guardiansOfTheGalaxyPlotFactory.plot().asText()
        );
    }
}