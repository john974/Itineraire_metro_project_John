import java.util.LinkedList;

/**
 * Classe pour creer le reseau de metro
 * @author Comma, Diallo, Minatchy, Ngatcha
 */

public class CreationReseauNew {

    /**
     * Methode qui initialise le reseau et renvoie ce reseau
     * @param reseau Reseau a initialiser
     * @return Reseau initialisé
     */
    public static Reseau initialiserReseau () {

        Reseau reseau = new Reseau(null);

        /* Initialisation de la startStation */
            //A faire...

        /* Initialisation de listAllStations */
        LinkedList<Station> listAllStations = null;
        listAllStations = initializeAllStations();
        reseau.setAllStations(listAllStations);

        /* Initialisation de visitedStations */
            //Il n'y a rien a faire ici pour l'initialisation.
        
        return reseau; /* On renvoie de réseau qui vient d'être initialise */
    }


    /**
     * Methode appelee par la methode initialiserReseau et qui initialise la liste de toutes les stations du reseaux
     * @return Liste de toutes les stations initialisée
     */
    public static LinkedList<Station> initializeAllStations (){
        /***********************************/
        /* Creation de toutes les stations */
        /***********************************/
            //Stations surtout de la ligne 1
        Station chateauDeVincennes = new Station ("Chateau de Vincennes", 3, false);
        Station berault = new Station ("Berault", 4, false);
        Station saintMande = new Station ("Saint Mande", 2, false);
        Station porteDeVincennes = new Station ("Porte de Vincennes", 3, false);
        Station nation = new Station ("Nation", 2, false);
        Station reuillyDiderot = new Station ("Reuilly-Diderot", 4, false);
        Station gareDeLyon = new Station ("Gare de Lyon", 1, false);
        Station bastille = new Station ("Bastille", 5, false);
        Station stPaul = new Station ("St-Paul", 6, false);
        Station hotelDeVille = new Station ("Hotel de Ville", 2, false);
        Station chatelet = new Station ("Chatelet", 1, false);
        Station louvreRivoli = new Station ("Louvre Rivoli", 3, false);
        Station palaisRoyalMuseeDuLouvre = new Station ("Palais royal - Musee du Louvre", 2, false);
        Station tuileries = new Station ("Tuileries", 6, false);
        Station concorde = new Station ("Concorde", 3, false);
        Station champsElyseesClemenceau = new Station ("Champs Elysees - Clemenceau", 2, false);
        Station franklinDRoosevelt = new Station ("Franklin D. Roosevelt", 7, false);
        Station georgeV = new Station ("georgeV", 3, false);
        Station charlesDeGaulleEtoile = new Station ("Charles de Gaulle Etoile", 1, false);
        Station argentine = new Station ("Argentine", 10, false);
        Station porteMaillot = new Station ("Porte Maillot", 4, false);
        Station lesSablons = new Station ("Les Sablons", 3, false);
        Station pontDeNeuilly = new Station ("Pont de Neuilly", 2, false);
        Station esplanadeDeLaDefense = new Station ("Esplanade de la Defense", 2, false);
        Station laDefense = new Station ("La Defense", 1, false);
            // Stations surtout pour la ligne 4
        Station porteDeClignancourt = new Station ("Porte de Clignancourt", 2, false);
        Station simplon = new Station ("Simplon", 3, false);
        Station marcadetPoissonniers = new Station ("Marcadet Poissonniers", 5, false);
        Station chateauRouge = new Station ("Chateau Rouge", 6, false);
        Station barbesRochechouart = new Station ("Barbes Rochechouart", 4, false);
        Station gareDuNord = new Station ("Gare du Nord", 2, false);
        Station gareDeLEst = new Station ("Gare de l'Est", 2, false);
        Station chateauDEau = new Station ("Chateau d'Eau", 6, false);
        Station strasbourgSaintDenis = new Station ("Strasbourg Saint-Denis", 3, false);
        Station reaumurSebastopol = new Station ("Reaumur Sebastopol", 6, false);
        Station etienneMarcel = new Station ("Etienne Marcel", 5, false);
        Station lesHalles = new Station ("Les Halles", 2, false);
        //Station chatelet = new Station ("Berault", 4, false);
        Station cite = new Station ("Cite", 4, false);
        Station stMichel = new Station ("St-Michel", 6, false);
        Station odeon = new Station ("Odeon", 5, false);
        Station saintGermainDesPres = new Station ("Saint Germain des-Pres", 2, false);
        Station saintSulpice = new Station ("Saint-Sulpice", 3, false);
        Station stPlacide = new Station ("St-Placide", 8, false);
        Station montparnasseBienvenue = new Station ("Montparnasse Bienvenue", 3, false);
        Station valvin = new Station ("Valvin", 2, false);
        Station raspail = new Station ("Raspail", 1, false);
        Station moutonDuvernet = new Station ("Mouton Duvernet", 4, false);
        Station alesia = new Station ("Alesia", 4, false);
        Station porteDOrleans = new Station ("Porte d'Orleans", 9, false);
            // Stations surtout pour la ligne 8
        Station balard = new Station ("Balard", 7, false);
        Station lourmel = new Station ("Lourmel", 4, false);
        Station boucicaut = new Station ("Boucicaut", 3, false);
        Station felixFaure = new Station ("Felix Faure", 2, false);
        Station commerce = new Station ("Commerce", 7, false);
        Station cambronne = new Station ("Cambronne", 3, false);
        Station laMottePicquetGrenelle = new Station ("La Motte Picquet Grenelle", 2, false);
        Station ecoleMilitaire = new Station ("Ecole Militaire", 1, false);
        Station laTourMaubourg = new Station ("La Tour Maubourg", 3, false);
        Station invalides = new Station ("Invalides", 5, false);
        //Station concorde = new Station ("Concorde", 4, false);
        Station madeleine = new Station ("Madeleine", 6, false);
        Station opera = new Station ("Opera", 2, false);
        Station richelieuDrouot = new Station ("Richelieu Drouot", 2, false);
        Station grandsBoulevards = new Station ("Grands Boulevards", 4, false);
        Station bonneNouvelle = new Station ("Bonne Nouvelle", 6, false);
        //Station strasbourgSaintDenis = new Station ("Strasbourg Saint-Denis", 4, false);
        Station republique = new Station ("Republique", 8, false);
        Station fillesDuCalvaire = new Station ("Filles du Calvaire", 2, false);
        Station saintSebastienFroissart = new Station ("St-Sebastien Froissart", 7, false);
        Station cheminVert = new Station ("Chemin Vert", 6, false);
        //Station bastille = new Station ("Bastille", 4, false);
        Station ledruRollin = new Station ("Ledru-Rollin", 3, false);
        Station faidherbeChaligny = new Station ("Faidherbe Chaligny", 2, false);
        //Station reuillyDiderot = new Station ("Reuilly-Diderot", 4, false);
        Station montgallet = new Station ("Montgallet", 1, false);
        Station daumesnil = new Station ("Daumesnil", 2, false);
        Station michelBizot = new Station ("Michel Bizot", 8, false);
        Station porteDoree = new Station ("Porte Doree", 9, false);
        Station porteDeCharenton = new Station ("Porte de Charenton", 5, false);
        Station liberte = new Station ("Liberte", 3, false);
        Station charentonEcoles = new Station ("Charenton-Ecoles", 2, false);
        Station ecoleVeterinaireDeMaisonsAlfort = new Station ("Ecole Veterinaire de Maisons-Alfort", 3, false);
        Station maisonsAlfortStade = new Station ("Maisons-Alfort-Stade", 4, false);
        Station maisonsAlfortLesJuilliotes = new Station ("Maisons-Alfort Les Juilliotes", 5, false);
        Station creteilLEchat = new Station ("Creteil L'Echat", 7, false);
        Station creteilUniversite = new Station ("Creteil-Universite", 2, false);
        Station creteilPrefecture = new Station ("Creteil-Prefecture", 5, false);
        Station creteilPointeDuLac = new Station ("Creteil Pointe du Lac", 4, false);
            // Stations surtout pour la ligne 12
        Station porteDeLaChapelle = new Station ("Porte de la Chapelle", 1, false);
        Station marxDormoy = new Station ("Marx Dormoy", 3, false);
        //Station marcadetPoissonniers = new Station ("Alesia", 4, false);
        Station julesJoffrin = new Station ("Jules Joffrin", 2, false);
        Station lamarckCaulaincourt = new Station ("Lamarck Caulaincourt", 1, false);
        Station abbesses = new Station ("Abbesses", 10, false);
        Station pigalle = new Station ("Pigalle", 8, false);
        Station saintGeorges = new Station ("Saint-Georges", 4, false);
        Station notreDameDeLorette = new Station ("Notre-Dame de-Lorette", 5, false);
        Station triniteDEstienneDOrves = new Station ("Trinite d'Estienne d'Orves", 1, false);
        //Station saintLazare = new Station ("Saint-Lazare", 4, false);
        //Station madeleine = new Station ("Madeleine", 4, false);
        //Station concorde = new Station ("Concorde", 4, false);
        Station assembleeNationale = new Station ("Assemblee Nationale", 1, false);
        Station solferino = new Station ("Solferino", 9, false);
        Station rueDuBac = new Station ("Rue du Bac", 5, false);
        Station sevresBabylone = new Station ("Sevres Babylone", 3, false);
        Station rennes = new Station ("Rennes", 2, false);
        Station notreDameDesChamps = new Station ("Notre-Dame des-Champs", 4, false);
        //Station montparnasseBienvenue = new Station ("Montparnasse Bienvenue", 4, false);
        Station falguiere = new Station ("Falguiere", 5, false);
        Station pasteur = new Station ("Pasteur", 2, false);
        Station volontaires = new Station ("Volontaires", 10, false);
        Station vaugirard = new Station ("Vaugirard", 3, false);
        Station convention = new Station ("Convention", 2, false);
        Station porteDeVersailles = new Station ("Porte de Versailles", 1, false);
        Station corentinCelton = new Station ("Corentin Celton", 5, false);
        Station mairieDIssy = new Station ("Mairie d'Issy", 6, false);
            //Stations surtout pour la ligne 14
        Station saintLazare = new Station ("Saint-Lazare", 9, false);
        //Station madeleine = new Station ("Madeleine", 4, false);
        Station pyramides = new Station ("Pyramides", 8, false);
        //Station chatelet = new Station ("Chatelet", 4, false);
        //Station gareDeLyon = new Station ("Gare de Lyon", 4, false);
        Station bercy = new Station ("Bercy", 4, false);
        Station courStEmilion = new Station ("Cour St-Emilion", 2, false);
        Station bibliothequeFrMitterrand = new Station ("Bibliotheque Fr. Mitterrand", 3, false);
        Station olympiades = new Station ("Olympiades", 5, false);

        /**********************************************************/
        /* Creation de la liste de toutes les stations a renvoyer */
        /**********************************************************/
        LinkedList<Station> listAllStations = new LinkedList<Station>();

        listAllStations.add(chateauDeVincennes);
        listAllStations.add(berault);
        listAllStations.add(saintMande);
        listAllStations.add(porteDeVincennes);
        listAllStations.add(nation);
        listAllStations.add(reuillyDiderot);
        listAllStations.add(gareDeLyon);
        listAllStations.add(bastille);
        listAllStations.add(stPaul);
        listAllStations.add(hotelDeVille);
        listAllStations.add(chatelet);
        listAllStations.add(louvreRivoli);
        listAllStations.add(palaisRoyalMuseeDuLouvre);
        listAllStations.add(tuileries);
        listAllStations.add(concorde);
        listAllStations.add(champsElyseesClemenceau);
        listAllStations.add(franklinDRoosevelt);
        listAllStations.add(georgeV);
        listAllStations.add(charlesDeGaulleEtoile);
        listAllStations.add(argentine);
        listAllStations.add(porteMaillot);
        listAllStations.add(lesSablons);
        listAllStations.add(pontDeNeuilly);
        listAllStations.add(esplanadeDeLaDefense);
        listAllStations.add(laDefense);
        listAllStations.add(porteDeClignancourt);
        listAllStations.add(simplon);
        listAllStations.add(marcadetPoissonniers);
        listAllStations.add(chateauRouge);
        listAllStations.add(barbesRochechouart);
        listAllStations.add(gareDuNord);
        listAllStations.add(gareDeLEst);
        listAllStations.add(chateauDEau);
        listAllStations.add(strasbourgSaintDenis);
        listAllStations.add(reaumurSebastopol);
        listAllStations.add(etienneMarcel);
        listAllStations.add(lesHalles);
        listAllStations.add(cite);
        listAllStations.add(stMichel);
        listAllStations.add(odeon);
        listAllStations.add(saintGermainDesPres);
        listAllStations.add(saintSulpice);
        listAllStations.add(stPlacide);
        listAllStations.add(montparnasseBienvenue);
        listAllStations.add(valvin);
        listAllStations.add(raspail);
        listAllStations.add(moutonDuvernet);
        listAllStations.add(alesia);
        listAllStations.add(porteDOrleans);
        listAllStations.add(balard);
        listAllStations.add(lourmel);
        listAllStations.add(boucicaut);
        listAllStations.add(felixFaure);
        listAllStations.add(commerce);
        listAllStations.add(cambronne);
        listAllStations.add(laMottePicquetGrenelle);
        listAllStations.add(ecoleMilitaire);
        listAllStations.add(laTourMaubourg);
        listAllStations.add(invalides);
        listAllStations.add(madeleine);
        listAllStations.add(opera);
        listAllStations.add(richelieuDrouot);
        listAllStations.add(grandsBoulevards);
        listAllStations.add(bonneNouvelle);
        listAllStations.add(republique);
        listAllStations.add(fillesDuCalvaire);
        listAllStations.add(saintSebastienFroissart);
        listAllStations.add(cheminVert);
        listAllStations.add(ledruRollin);
        listAllStations.add(faidherbeChaligny);
        listAllStations.add(montgallet);
        listAllStations.add(daumesnil);
        listAllStations.add(michelBizot);
        listAllStations.add(porteDoree);
        listAllStations.add(porteDeCharenton);
        listAllStations.add(liberte);
        listAllStations.add(charentonEcoles);
        listAllStations.add(ecoleVeterinaireDeMaisonsAlfort);
        listAllStations.add(maisonsAlfortStade);
        listAllStations.add(maisonsAlfortLesJuilliotes);
        listAllStations.add(creteilLEchat);
        listAllStations.add(creteilUniversite);
        listAllStations.add(creteilPrefecture);
        listAllStations.add(creteilPointeDuLac);
        listAllStations.add(porteDeLaChapelle);
        listAllStations.add(marxDormoy);
        listAllStations.add(julesJoffrin);
        listAllStations.add(lamarckCaulaincourt);
        listAllStations.add(abbesses);
        listAllStations.add(pigalle);
        listAllStations.add(saintGeorges);
        listAllStations.add(notreDameDeLorette);
        listAllStations.add(triniteDEstienneDOrves);
        listAllStations.add(assembleeNationale);
        listAllStations.add(solferino);
        listAllStations.add(rueDuBac);
        listAllStations.add(sevresBabylone);
        listAllStations.add(rennes);
        listAllStations.add(notreDameDesChamps);
        listAllStations.add(falguiere);
        listAllStations.add(pasteur);
        listAllStations.add(volontaires);
        listAllStations.add(vaugirard);
        listAllStations.add(convention);
        listAllStations.add(porteDeVersailles);
        listAllStations.add(corentinCelton);
        listAllStations.add(mairieDIssy);
        listAllStations.add(saintLazare);
        listAllStations.add(pyramides);
        listAllStations.add(bercy);
        listAllStations.add(courStEmilion);
        listAllStations.add(bibliothequeFrMitterrand);
        listAllStations.add(olympiades);

        return listAllStations;
    }
    
}
