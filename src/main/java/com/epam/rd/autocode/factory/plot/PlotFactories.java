package com.epam.rd.autocode.factory.plot;

import java.util.List;

class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return new ClassicDisneyPlotFactory(hero, beloved, villain);
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        return new ContemporaryDisneyPlotFactory(hero, epicCrisis,funnyFriend);
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return new MarvelPlotFactory(heroes,epicCrisis,villain);
    }

    private static class ClassicDisneyPlotFactory implements PlotFactory{
        private Character hero;
        private Character beloved;
        private Character villian;

        public ClassicDisneyPlotFactory(Character hero, Character beloved, Character villian) {
            this.hero = hero;
            this.beloved = beloved;
            this.villian = villian;
        }

        @Override
        public Plot plot() {
            String text = String.format("%s is young and adorable. %s and %s love each other. %s interferes with their happiness, but loses in the end.",
                    hero.name(),hero.name(), beloved.name(), villian.name());
            return () -> text;
        }
    }

    private static class ContemporaryDisneyPlotFactory implements PlotFactory{
        private Character hero;
        private EpicCrisis epicCrisis;
        Character funnyFriend;

        public ContemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
            this.hero = hero;
            this.epicCrisis = epicCrisis;
            this.funnyFriend = funnyFriend;
        }

        @Override
        public Plot plot() {
            String text = String.format("In the beginning, %s feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - %s. %s stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny %s, %s restores the spirit, overcomes the crisis and gains gratitude and respect.",
                    hero.name(), epicCrisis.name(), hero.name(), funnyFriend.name(), hero.name());
            return () -> text;
        }
    }
    private static class MarvelPlotFactory implements PlotFactory{
        private Character[] heroes;
        private EpicCrisis epicCrisis;
        private Character villian;

        public MarvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villian) {
            this.heroes = heroes;
            this.epicCrisis = epicCrisis;
            this.villian = villian;
        }

        @Override
        public Plot plot() {
            String heroNames = "";
            for (int i = 0; i < heroes.length; i++) {
                if (i != 0) {
                    if (i == heroes.length - 1) {
                        heroNames += " and ";
                    } else {
                        heroNames += ", ";
                    }
                }
                heroNames += heroes[i].name();
            }
            String text = String.format("%s is about to access Stark Industries technologies and that threatens the world. But %s is on guard. So, no way that intrigues of %s will bend the willpower of the inflexible hero.",
                    epicCrisis.name(), heroNames, villian.name());
            return () -> text;
        }
    }
}
