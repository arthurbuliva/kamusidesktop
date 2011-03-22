/**
 * WordAdder.java
 * Created on Nov 23, 2009, 8:50:26 PM
 * @author arthur
 */
package org.kamusi;

import javax.swing.ImageIcon;

/**
 * class WordAdder
 */
public class WordAdder extends javax.swing.JFrame
{

    /** Creates new form WordAdder */
    public WordAdder()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().
                getResource("/org/kamusi/resources/favicon.png")).getImage());
        setLocationRelativeTo(null);
    }

    /** Creates new form WordAdder
     * @param text
     * @param firstToSecond 
     */
    public WordAdder(String text, boolean firstToSecond)
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().
                getResource("/org/kamusi/resources/favicon.png")).getImage());
        setLocationRelativeTo(null);

        if (firstToSecond)
        {
            englishWord.setText(text);
        }
        else
        {
            swahiliWord.setText(text);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelAddNewWordButton = new javax.swing.JButton();
        addNewWordButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        engWordLabel = new javax.swing.JLabel();
        engHeadwordLabel = new javax.swing.JLabel();
        swaWordLabel = new javax.swing.JLabel();
        swaHeadwordLabel = new javax.swing.JLabel();
        partOfSpeechLabel = new javax.swing.JLabel();
        englishWord = new javax.swing.JTextField();
        englishHeadword = new javax.swing.JTextField();
        swahiliWord = new javax.swing.JTextField();
        swahiliHeadword = new javax.swing.JTextField();
        classLabel = new javax.swing.JLabel();
        partOfSpeechComboBox = new javax.swing.JComboBox();
        classComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        engPluLabel = new javax.swing.JLabel();
        altEngSingLabel = new javax.swing.JLabel();
        altEngPluLabel = new javax.swing.JLabel();
        engDefLabel = new javax.swing.JLabel();
        derivedLangLabel = new javax.swing.JLabel();
        relatedWordLabel = new javax.swing.JLabel();
        taxonomyLabel = new javax.swing.JLabel();
        engExampleLabel = new javax.swing.JLabel();
        swaPluralLabel = new javax.swing.JLabel();
        altSwaSingLabel = new javax.swing.JLabel();
        altSwaPluLabel = new javax.swing.JLabel();
        swaDefLabel = new javax.swing.JLabel();
        derivedWordLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        swahiliPlural = new javax.swing.JTextField();
        alternateSwahiliSingular = new javax.swing.JTextField();
        alternateSwahiliPlural = new javax.swing.JTextField();
        swahiliDefinition = new javax.swing.JTextField();
        derivedWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        englishExample = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        swahiliExample = new javax.swing.JTextArea();
        taxonomy = new javax.swing.JTextField();
        relatedWord = new javax.swing.JTextField();
        englishDefinition = new javax.swing.JTextField();
        alternateEnglishPlural = new javax.swing.JTextField();
        alternateEnglishSingular = new javax.swing.JTextField();
        englishPlural = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        dialectLabel = new javax.swing.JLabel();
        terminologyLabel = new javax.swing.JLabel();
        dialectComboBox = new javax.swing.JComboBox();
        terminologyComboBox = new javax.swing.JComboBox();
        swaExampleLabel = new javax.swing.JLabel();
        derivedLanguageCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kamusi Desktop - Word Adder");
        setAlwaysOnTop(true);
        setResizable(false);

        cancelAddNewWordButton.setMnemonic('C');
        cancelAddNewWordButton.setText("Cancel");
        cancelAddNewWordButton.setToolTipText("Cancel the addition of a new word");
        cancelAddNewWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddNewWordButtonActionPerformed(evt);
            }
        });

        addNewWordButton.setMnemonic('A');
        addNewWordButton.setText("ADD");
        addNewWordButton.setToolTipText("Add the new word to the database");
        addNewWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewWordButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Required Fields"));

        engWordLabel.setText("Eng Word");

        engHeadwordLabel.setText("Eng Headword");

        swaWordLabel.setText("Swa Word");

        swaHeadwordLabel.setText("Swa Headword");

        partOfSpeechLabel.setText("Part Of Speech");

        englishWord.setToolTipText("English word");

        englishHeadword.setToolTipText("English headword");

        swahiliWord.setToolTipText("Swahili word");

        swahiliHeadword.setToolTipText("Swahili headword");

        classLabel.setText("Class");

        partOfSpeechComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "abbreviation", "adj/adv", "adjective", "adverb", "conjuction", "infix", "interjection", "interrogative", "name", "noun", "phrase", "prefix", "preposition", "pronoun", "verb", "verb subject", "verb tense", "verb relative", "verb object", "verb suffix" }));
        partOfSpeechComboBox.setSelectedIndex(-1);
        partOfSpeechComboBox.setToolTipText("Select part of speech");

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "applicative", "appl-assoc", "appl-assoc-caus", "appl-caus", "appl-caus-intr", "appl-caus-pass", "appl-caus-recip", "appl-caus-refl", "appl-conv", "appl-intr", "appl-inver", "appl-pass", "appl-pass-poten", "appl-poten", "appl-recip", "appl-refl", "associative", "assoc-caus", "assoc-intr", "assoc-inver", "assoc-stat", "auxiliary", "aux-det", "causative", "caus-intr", "caus-inver", "caus-pass", "caus-poten", "caus-recip", "caus-refl", "caus-stat", "caus-trans", "conjugated", "contactive", "converse", "conv-poten", "determinative", "durative", "imperative", "infinitive", "intensive", "intransitive", "intr-inver", "intr-inver-stat", "inversive", "inver-poten-trans", "negative", "passive", "pass-poten", "possessive", "potential", "poten-recip", "poten-trans", "reciprocal", "reflexive", "relative", "stative", "transitive", "1", "1/2", "2", "3", "3/4", "3/4an", "3/10", "4", "5", "5/6", "5/6an", "5/6ca", "6", "6/6", "6an", "7", "7/8", "7/8an", "8", "9", "9/10", "9/10an", "9/10ca", "9an", "10", "11", "11/4", "11/6", "11/6an", "11/8", "11/10", "11/10an", "14", "15", "16", "16/17/18", "17", "18" }));
        classComboBox.setSelectedIndex(-1);
        classComboBox.setToolTipText("Select class of word (Noun class, verb type etc.)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(partOfSpeechLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partOfSpeechComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engHeadwordLabel)
                            .addComponent(engWordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(englishWord)
                            .addComponent(englishHeadword, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(swaHeadwordLabel)
                    .addComponent(swaWordLabel)
                    .addComponent(classLabel))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(swahiliHeadword, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(swahiliWord, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(classComboBox, 0, 305, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engWordLabel)
                    .addComponent(englishWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swaWordLabel)
                    .addComponent(swahiliWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engHeadwordLabel)
                    .addComponent(englishHeadword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swaHeadwordLabel)
                    .addComponent(swahiliHeadword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partOfSpeechLabel)
                    .addComponent(partOfSpeechComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Optional Fields"));

        engPluLabel.setText("Eng Plural");

        altEngSingLabel.setText("Alt Eng Sing");

        altEngPluLabel.setText("Alt Eng Plu");

        engDefLabel.setText("Eng Def");

        derivedLangLabel.setText("Derived Lang");

        relatedWordLabel.setText("Related word");

        taxonomyLabel.setText("Taxonomy");

        engExampleLabel.setText("Eng Example");

        swaPluralLabel.setText("Swa Plural");

        altSwaSingLabel.setText("Alt Swa Sing");

        altSwaPluLabel.setText("Alt Swa Plu");

        swaDefLabel.setText("Swa Def");

        derivedWordLabel.setText("Derived Word");

        noteLabel.setText("Note");

        swahiliPlural.setToolTipText("Swahili plural");

        alternateSwahiliSingular.setToolTipText("Alternative Swahili singular word");

        alternateSwahiliPlural.setToolTipText("Alternative Swahili plural word");

        swahiliDefinition.setToolTipText("Swahili definition");

        derivedWord.setToolTipText("Derived word");

        englishExample.setColumns(20);
        englishExample.setLineWrap(true);
        englishExample.setRows(5);
        englishExample.setToolTipText("English example");
        englishExample.setWrapStyleWord(true);
        jScrollPane1.setViewportView(englishExample);

        swahiliExample.setColumns(20);
        swahiliExample.setLineWrap(true);
        swahiliExample.setRows(5);
        swahiliExample.setToolTipText("Swahili Example");
        swahiliExample.setWrapStyleWord(true);
        jScrollPane2.setViewportView(swahiliExample);

        taxonomy.setToolTipText("Taxonomy");

        relatedWord.setToolTipText("Related word");

        englishDefinition.setToolTipText("English definition");

        alternateEnglishPlural.setToolTipText("Alternative English plural word");

        alternateEnglishSingular.setToolTipText("Alternative English singular word");

        englishPlural.setToolTipText("English plural word");

        note.setColumns(20);
        note.setLineWrap(true);
        note.setRows(5);
        note.setToolTipText("Notes");
        note.setWrapStyleWord(true);
        jScrollPane3.setViewportView(note);

        dialectLabel.setText("Dialect");

        terminologyLabel.setText("Terminology");

        dialectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kiamu", "Kimvita", "Kipemba", "Kitanga", "Kiunguja", "Sheng", "archaic", "colloquial", "dialectical", "obsolete", "recent" }));
        dialectComboBox.setSelectedIndex(-1);
        dialectComboBox.setToolTipText("Select dialect");

        terminologyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "general", "Christian", "IT-klnX", "Islamic", "agriculture", "anatomy", "anthropology", "astronomy", "automotive", "aviation", "biblical", "biology", "botany", "chemistry", "culinary", "economics", "electricity", "enclitic", "entomology", "finance", "games (cards)", "geography", "grammar", "historical", "legal", "linguistics", "literary", "marine", "mathematics", "mechanics", "medical", "meteorology", "military", "minerals", "music", "mythology", "names", "nautical", "optics", "ornithology", "pejorative", "personal", "pharmacy", "phonetics", "photography", "physics", "physiology", "poetic", "political", "polygamy", "psychology", "railway", "religious", "slang", "sport", "technology", "typography", "vulgar", "zoology" }));
        terminologyComboBox.setToolTipText("Select terminology");

        swaExampleLabel.setText("Swa Example");

        derivedLanguageCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afrikaans", "Arabic", "Bantu", "Chinese", "English", "Farsi", "French", "German", "Gujerati", "Hebrew", "Hindi", "Japanese", "Latin", "Luganda", "Malay", "Portuguese", "Russian", "Spanish", "Turkish", "Zulu" }));
        derivedLanguageCombo.setSelectedIndex(-1);
        derivedLanguageCombo.setToolTipText("Select derived language");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(engPluLabel)
                    .addComponent(altEngSingLabel)
                    .addComponent(altEngPluLabel)
                    .addComponent(engDefLabel)
                    .addComponent(derivedLangLabel)
                    .addComponent(relatedWordLabel)
                    .addComponent(taxonomyLabel)
                    .addComponent(engExampleLabel)
                    .addComponent(dialectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(derivedLanguageCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dialectComboBox, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(taxonomy)
                    .addComponent(relatedWord)
                    .addComponent(englishDefinition)
                    .addComponent(alternateEnglishPlural)
                    .addComponent(alternateEnglishSingular)
                    .addComponent(englishPlural))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(terminologyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(terminologyComboBox, 0, 290, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altSwaPluLabel)
                            .addComponent(swaDefLabel)
                            .addComponent(altSwaSingLabel)
                            .addComponent(swaPluralLabel)
                            .addComponent(derivedWordLabel)
                            .addComponent(noteLabel)
                            .addComponent(swaExampleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(derivedWord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(alternateSwahiliSingular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(swahiliDefinition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(alternateSwahiliPlural, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(swahiliPlural, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engPluLabel)
                    .addComponent(swaPluralLabel)
                    .addComponent(englishPlural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swahiliPlural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altEngSingLabel)
                    .addComponent(altSwaSingLabel)
                    .addComponent(alternateEnglishSingular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternateSwahiliSingular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altEngPluLabel)
                    .addComponent(altSwaPluLabel)
                    .addComponent(alternateEnglishPlural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternateSwahiliPlural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engDefLabel)
                    .addComponent(swaDefLabel)
                    .addComponent(englishDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swahiliDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(derivedLangLabel)
                    .addComponent(derivedWordLabel)
                    .addComponent(derivedWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derivedLanguageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(relatedWordLabel)
                            .addComponent(noteLabel)
                            .addComponent(relatedWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taxonomyLabel)
                            .addComponent(taxonomy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swaExampleLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(engExampleLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dialectLabel)
                    .addComponent(dialectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terminologyLabel)
                    .addComponent(terminologyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addNewWordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelAddNewWordButton)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelAddNewWordButton)
                    .addComponent(addNewWordButton))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewWordButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addNewWordButtonActionPerformed
    {//GEN-HEADEREND:event_addNewWordButtonActionPerformed

        if (addWord())
        {
            MainWindow.showInfo("Word added successfully!");
            dispose();
        }
        else
        {
        }
    }//GEN-LAST:event_addNewWordButtonActionPerformed

    private void cancelAddNewWordButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelAddNewWordButtonActionPerformed
    {//GEN-HEADEREND:event_cancelAddNewWordButtonActionPerformed

        dispose();
    }//GEN-LAST:event_cancelAddNewWordButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new WordAdder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewWordButton;
    private javax.swing.JLabel altEngPluLabel;
    private javax.swing.JLabel altEngSingLabel;
    private javax.swing.JLabel altSwaPluLabel;
    private javax.swing.JLabel altSwaSingLabel;
    private javax.swing.JTextField alternateEnglishPlural;
    private javax.swing.JTextField alternateEnglishSingular;
    private javax.swing.JTextField alternateSwahiliPlural;
    private javax.swing.JTextField alternateSwahiliSingular;
    private javax.swing.JButton cancelAddNewWordButton;
    private javax.swing.JComboBox classComboBox;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel derivedLangLabel;
    private javax.swing.JComboBox derivedLanguageCombo;
    private javax.swing.JTextField derivedWord;
    private javax.swing.JLabel derivedWordLabel;
    private javax.swing.JComboBox dialectComboBox;
    private javax.swing.JLabel dialectLabel;
    private javax.swing.JLabel engDefLabel;
    private javax.swing.JLabel engExampleLabel;
    private javax.swing.JLabel engHeadwordLabel;
    private javax.swing.JLabel engPluLabel;
    private javax.swing.JLabel engWordLabel;
    private javax.swing.JTextField englishDefinition;
    private javax.swing.JTextArea englishExample;
    private javax.swing.JTextField englishHeadword;
    private javax.swing.JTextField englishPlural;
    private javax.swing.JTextField englishWord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea note;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JComboBox partOfSpeechComboBox;
    private javax.swing.JLabel partOfSpeechLabel;
    private javax.swing.JTextField relatedWord;
    private javax.swing.JLabel relatedWordLabel;
    private javax.swing.JLabel swaDefLabel;
    private javax.swing.JLabel swaExampleLabel;
    private javax.swing.JLabel swaHeadwordLabel;
    private javax.swing.JLabel swaPluralLabel;
    private javax.swing.JLabel swaWordLabel;
    private javax.swing.JTextField swahiliDefinition;
    private javax.swing.JTextArea swahiliExample;
    private javax.swing.JTextField swahiliHeadword;
    private javax.swing.JTextField swahiliPlural;
    private javax.swing.JTextField swahiliWord;
    private javax.swing.JTextField taxonomy;
    private javax.swing.JLabel taxonomyLabel;
    private javax.swing.JComboBox terminologyComboBox;
    private javax.swing.JLabel terminologyLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Adds a word to the database
     * @return true if word was added successfully, false otherwise
     */
    private boolean addWord()
    {
        return new Editor().addWord(englishWord.getText().trim(),
                swahiliWord.getText().trim(),
                englishHeadword.getText().trim(),
                swahiliHeadword.getText().trim(),
                (String) partOfSpeechComboBox.getItemAt(partOfSpeechComboBox.getSelectedIndex()),
                String.valueOf(classComboBox.getSelectedIndex()),
                swahiliPlural.getText().trim(),
                englishPlural.getText().trim(),
                alternateEnglishSingular.getText().trim(),
                alternateSwahiliSingular.getText().trim(),
                alternateEnglishPlural.getText().trim(),
                alternateSwahiliPlural.getText().trim(),
                englishDefinition.getText().trim(),
                swahiliDefinition.getText().trim(),
                derivedWord.getText().trim(),
                (String) derivedLanguageCombo.getItemAt(derivedLanguageCombo.getSelectedIndex()),
                relatedWord.getText().trim(),
                note.getText().trim(),
                taxonomy.getText().trim(),
                englishExample.getText().trim(),
                swahiliExample.getText().trim(),
                (String) dialectComboBox.getItemAt(dialectComboBox.getSelectedIndex()),
                (String) terminologyComboBox.getItemAt(terminologyComboBox.getSelectedIndex()));
    }
}