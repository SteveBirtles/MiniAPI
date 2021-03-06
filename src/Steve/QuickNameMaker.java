package Steve;

import java.util.Random;

public class QuickNameMaker {

    private static String[] names = {"Teodoro Tedrick",
            "Rolf Runion",
            "Janae Jaso",
            "Adrianne Anthony",
            "Anisa Amrhein",
            "Fernande Few",
            "Jonell Job",
            "Sammie Schrimsher",
            "Ines Ivy",
            "Fredricka Freitag",
            "Carolyne Carriere",
            "Sierra Sponaugle",
            "Brock Balsley",
            "Roxana Ryles",
            "Florida Franco",
            "Maia Morehouse",
            "Rebecka Ruel",
            "Crystal Crotty",
            "Mammie Musso",
            "Dominque Dundas",
            "Otis Oriol",
            "Nickie Nathaniel",
            "Bernadette Burford",
            "Tawanda Tames",
            "Nelia Normandin",
            "Sheri Scharff",
            "Elana Engle",
            "Jessie Jerabek",
            "Camelia Catalano",
            "Elayne Evans",
            "Bertie Brennan",
            "Jamaal Jarosz",
            "Luanne Lundy",
            "Nanci Nerney",
            "Cristobal Crutchfield",
            "Thi Tison",
            "Erick Ephraim",
            "Freeda Fortes",
            "Nathalie Newport",
            "Refugia Reising",
            "Renate Reller",
            "Denise Daggett",
            "Shea Sills",
            "Malisa Martz",
            "Myron Morquecho",
            "Samatha Stembridge",
            "Magdalen Mcmorris",
            "Raymundo Ruano",
            "Madison Markee",
            "Kevin Kreitzer",
            "Hector Hart",
            "Antonette Artrip",
            "Sadie Sonnenberg",
            "Florance Fankhauser",
            "Williams Weisner",
            "Myra Medders",
            "Tierra Trenholm",
            "Gabriella Gusman",
            "Blossom Bou",
            "Eldon Ettinger",
            "Warren Withrow",
            "Giuseppe Gartin",
            "Jessi Jellison",
            "Treena Thorsen",
            "Iraida Ivey",
            "Otto Olden",
            "Alia Andres",
            "Elvina Eilerman",
            "Jacquie Jaillet",
            "Nohemi Nipper",
            "Antony Abarca",
            "Stanford Spurling",
            "Viki Vaca",
            "Erin Ellingson",
            "Delpha Dimas",
            "Carleen Crago",
            "William Wootton",
            "Anton Amorim",
            "Hayden Hillebrand",
            "Reynalda Ratchford",
            "Libby Lex",
            "Prince Pricer",
            "Slyvia Stonesifer",
            "Rafaela Rahn",
            "Cleta Covarrubias",
            "Carissa Coddington",
            "Melinda Montelongo",
            "Katharine Keeling",
            "Dayle Devilbiss",
            "Nikita Nourse",
            "Agatha Auer",
            "Sherill Sarcone",
            "Estefana Every",
            "Louis Luera",
            "Lorene Lundquist",
            "Ashanti Aubry",
            "Dulcie Debartolo",
            "Na Nguyen",
            "Donette Doney",
            "Gayle Glatz",
            "Kai Kowalczyk",
            "Maile Mehring",
            "Terisa Tassin",
            "Alia August",
            "Tinisha Tuff",
            "Susanne Sepulveda",
            "Florene Fraser",
            "Alleen Adame",
            "Melanie Myron",
            "Ester Eguia",
            "Danille Dollinger",
            "Altha Arthur",
            "Berneice Bourdeau",
            "Ronna Ramthun",
            "Jeanice Jeanbaptiste",
            "Brian Boomhower",
            "Roseanna Redus",
            "Nena Nevarez",
            "Gwenn Goldschmidt",
            "Lannie Laughton",
            "Lelia Lamoureaux",
            "Shenika Spellman",
            "Kera Klos",
            "Ashlee Ash",
            "Dalila Devilbiss",
            "Lawrence Lenard",
            "Israel Im",
            "Olinda Owens",
            "Kathyrn Kleist",
            "Abel Alli",
            "Amparo Amundsen",
            "Lai Llewellyn",
            "Angelic Atha",
            "Lyla Landa",
            "Lang Lanman",
            "Bella Buell",
            "Mathilda Mcelyea",
            "Reinaldo Reiber",
            "Hye Hooley",
            "Melvina Merlo",
            "Guadalupe Grau",
            "Eldon Elmer",
            "Evelin Epling",
            "Issac Iriarte",
            "Columbus Celentano",
            "Tory Tovar",
            "Shaina Slaten",
            "Tawna Tomblin",
            "Edelmira Emery",
            "Faustina Filkins",
            "Ivonne Ivery",
            "Porfirio Piekarski",
            "Mechelle Meder",
            "Sharron Streit",
            "Darcy Doung",
            "Sarai Such",
            "Wilton Wyse",
            "Maryjane Mattis",
            "Letha Lim",
            "Laverna Lemarr",
            "Erinn Ell",
            "Verlie Villines",
            "Gwenn Gangestad",
            "Hortensia Hepworth",
            "Ebonie Engelke",
            "Geri Garry",
            "Eddie Eisenhower",
            "Marlys Mattera",
            "Keesha Koren",
            "Juana Jefferis",
            "Reatha Raske",
            "Elmer Ellerman",
            "Tiara Tomita",
            "Wilfred Woodbridge",
            "Mathew Mika",
            "Jordon Jankowski",
            "Lise Loudermilk",
            "Royce Roberge",
            "Sunshine Sneller",
            "Billye Bye",
            "Dennis Digirolamo",
            "Brenna Brugman",
            "Brynn Barks",
            "Hermelinda Hsieh",
            "Quiana Quinby",
            "Trey Tyson",
            "Dion Dozal",
            "Dwight Dowe",
            "Kum Kersten",
            "Marx Mulvaney",
            "Wyatt Wee",
            "Casandra Cordon",
            "Hyman Haswell",
            "Matthew Muscarella",
            "Stefanie Skowron",
            "Hue Hannan",
            "Charlene Cappiello",
            "Lashawn Lundin",
            "Melina Mashburn",
            "Josh Jarret"};

    public static String next(Random rnd) {
        int n = rnd.nextInt(names.length);
        return names[n];
    }
}
