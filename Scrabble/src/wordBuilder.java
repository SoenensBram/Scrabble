/**
 *
 */
public class wordBuilder {
    private String[] letters;
    private String[] uniek;
    private int[] uniekNumber;
    private Tree<String>[] trees;


    public wordBuilder(){
        Generator generator = new Generator();
        letters = generator.getLetters();
        uniek = generator.getLetters();
        uniekNumber = generator.getUniekNumber();
        initializeAllTrees();
    }

    public wordBuilder(int maxLetters){
        Generator generator = new Generator(maxLetters);
        letters = generator.getLetters();
        uniek = generator.getLetters();
        uniekNumber = generator.getUniekNumber();
        initializeAllTrees();
    }

    private void initializeAllTrees() {
        /**
         * Roots voor trees toevoegen
         */
        for (int i = 0; i < trees.length; i++) {
            trees[i] = new Tree<String>(uniek[i]);
        }
        /**
         * Childeren toevoegen aan tree (diepte 1)
         */
        for (int i = 0; i < trees.length; i++) {
            Tree<String> letterTree;
            letterTree = new Tree<String>(uniek[i]);
            int b = uniekNumber[i];
            if (letterTree.root().getElement() == uniek[i]) {
                b--;
            }
            int c = 0;
            for (int a = 0; a < uniek.length - 1; a++) {

            }
            trees[i] = letterTree;
        }

        /**
         * Genereren van de hele boom
         */
        Tree<>[] depth1 = trees;
        int b = 0;
        for (int i = 1; i < trees.length; i++) {
            for (int a = 1; a < trees.length; a++) {
                trees[a].attach();
            }
        }
    }

    public String calculateAndReturnAnswer(){
        return null;
    }


}
