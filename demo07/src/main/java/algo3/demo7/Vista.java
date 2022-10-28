package algo3.demo7;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.tree.DefaultMutableTreeNode;

public class Vista {

    private JFrame frame;
    private JTabbedPane tabbedPane;
    private JPanel panel;
    private JScrollPane scrollPane;
    private JCheckBox cB1;
    private JCheckBox cB2;
    private JCheckBox cB3;
    private ButtonGroup bG;
    private JRadioButton rB1;
    private JRadioButton rB2;
    private JRadioButton rB3;
    private JRadioButton rB4;
    private JPanel panelCheckBoxes;
    private JPanel panelRadioButtons;
    private JPanel panelPanelRadioButtons;
    private JPanel panelButton;
    private JButton jB;
    private JPasswordField passwordField;
    private JTextArea textArea;
    private JTextField textField;
    private JPanel panelConBorde;
    private JLabel nombre;
    private JLabel antecedentes;
    private JLabel contraseña;
    private JPanel panelTextField;
    private JPanel panelScrollPane;
    private JPanel panelPasswordField;
    private JPanel panelPanelScrollPane;
    private JSplitPane splitPane;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private BasicArrowButton basicArrowButton;
    private JLabel ingresoPorSeleccion;
    private JLabel visualizacionDeModelos;
    private JComboBox comboBox;
    private JList list;
    private JSlider slider;
    private JSpinner spinner;
    private JPanel panelIngresoPorSeleccion;
    private JPanel panelVisualizacionDeModelos;
    private JPanel panelComboBox;
    private JPanel panelList;
    private JPanel panelSlider;
    private JPanel panelSpinner;
    private JTable table;
    private JTree tree;
    private JPanel panelTable;
    private JPanel panelTree;
    private JScrollPane scrollPaneList;
    private JScrollPane scrollPaneTable;
    private JScrollPane scrollPaneTree;
    private JProgressBar progressBar;
    private JMenuBar menuBar;
    private JMenu verMenu;
    private JSeparator separator;
    private JMenu ayudaMenu;
    private JCheckBoxMenuItem jCheckBoxMenuItem;
    private JRadioButtonMenuItem jRadioButtonMenuItem1;
    private JRadioButtonMenuItem jRadioButtonMenuItem2;
    private JRadioButtonMenuItem jRadioButtonMenuItem3;
    private ButtonGroup bG2;
    private JMenu resolucionMenu;
    private JMenuItem soloTextoMenuItem1;
    private JMenuItem soloTextoMenuItem2;

    public Vista() {

        frame = new JFrame("Demo 7");

        tabbedPane = new JTabbedPane();

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        cB1 = new JCheckBox("Java");
        cB2 = new JCheckBox("C#");
        cB3 = new JCheckBox("Python");
        cB1.setMaximumSize(new Dimension(80, 25));
        cB2.setMaximumSize(new Dimension(80, 25));
        cB3.setMaximumSize(new Dimension(80, 25));
        cB1.setBackground(Color.CYAN);
        cB2.setBackground(Color.CYAN);
        cB3.setBackground(Color.CYAN);
        cB1.setAlignmentX(Component.CENTER_ALIGNMENT);
        cB2.setAlignmentX(Component.CENTER_ALIGNMENT);
        cB3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelCheckBoxes = new JPanel();
        panelCheckBoxes.setLayout(new BoxLayout(panelCheckBoxes, BoxLayout.Y_AXIS));
        panelCheckBoxes.setBackground(Color.CYAN);
        panelCheckBoxes.add(cB1);
        panelCheckBoxes.add(cB2);
        panelCheckBoxes.add(cB3);

        rB1 = new JRadioButton("Malo");
        rB2 = new JRadioButton("Regular");
        rB3 = new JRadioButton("Bueno");
        rB4 = new JRadioButton("Excelente");
        rB1.setBackground(Color.YELLOW);
        rB2.setBackground(Color.YELLOW);
        rB3.setBackground(Color.YELLOW);
        rB4.setBackground(Color.YELLOW);

        bG = new ButtonGroup();
        bG.add(rB1);
        bG.add(rB2);
        bG.add(rB3);
        bG.add(rB4);

        panelPanelRadioButtons = new JPanel();
        panelPanelRadioButtons.setLayout(new GridBagLayout());
        panelPanelRadioButtons.setBackground(Color.YELLOW);
        panelRadioButtons = new JPanel();
        panelRadioButtons.setLayout(new FlowLayout());
        panelRadioButtons.setBackground(Color.YELLOW);
        panelRadioButtons.add(rB1);
        panelRadioButtons.add(rB2);
        panelRadioButtons.add(rB3);
        panelRadioButtons.add(rB4);
        panelPanelRadioButtons.add(panelRadioButtons, new GridBagConstraints());

        jB = new JButton("Enviar");
        panelButton = new JPanel();
        panelButton.setBackground(Color.GREEN);
        panelButton.add(jB);

        panel.add(panelCheckBoxes, BorderLayout.PAGE_START);
        panel.add(panelPanelRadioButtons, BorderLayout.CENTER);
        panel.add(panelButton, BorderLayout.PAGE_END);

        panelConBorde = new JPanel();
        panelConBorde.setBorder(
                BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Complete los campos"),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        panelConBorde.setLayout(new BorderLayout());
        panelConBorde.setBackground(new Color(192, 255, 192));

        nombre = new JLabel("Nombre: ");
        nombre.setPreferredSize(new Dimension(100, 25));
        textField = new JTextField();
        textField.setColumns(32);

        antecedentes = new JLabel("Antecedentes: ");
        antecedentes.setPreferredSize(new Dimension(100, 25));
        textArea = new JTextArea("");
        textArea.setColumns(30);
        textArea.setRows(12);
        scrollPane = new JScrollPane(textArea);

        contraseña = new JLabel("Contraseña: ");
        contraseña.setPreferredSize(new Dimension(100, 25));
        passwordField = new JPasswordField();
        passwordField.setColumns(8);

        FlowLayout fL = new FlowLayout();
        fL.setAlignment(FlowLayout.LEFT);
        panelTextField = new JPanel();
        panelScrollPane = new JPanel();
        panelPasswordField = new JPanel();
        panelTextField.setLayout(fL);
        panelScrollPane.setLayout(fL);
        panelPasswordField.setLayout(fL);
        panelTextField.setBackground(new Color(192, 255, 192));
        panelScrollPane.setBackground(new Color(192, 255, 192));
        panelPasswordField.setBackground(new Color(192, 255, 192));

        panelTextField.add(nombre);
        panelTextField.add(textField);
        panelScrollPane.add(antecedentes);
        panelScrollPane.add(scrollPane);
        panelPasswordField.add(contraseña);
        panelPasswordField.add(passwordField);
        basicArrowButton = new BasicArrowButton(BasicArrowButton.EAST);
        basicArrowButton.setToolTipText("Login");
        panelPasswordField.add(basicArrowButton);

        panelPanelScrollPane = new JPanel();
        panelPanelScrollPane.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();
        gBC.anchor = GridBagConstraints.WEST;
        gBC.weightx = 1;
        panelPanelScrollPane.add(panelScrollPane, gBC);
        panelPanelScrollPane.setBackground(new Color(192, 255, 192));

        panelConBorde.add(panelTextField, BorderLayout.PAGE_START);
        panelConBorde.add(panelPanelScrollPane, BorderLayout.CENTER);
        panelConBorde.add(panelPasswordField, BorderLayout.PAGE_END);

        panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.setBackground(new Color(0, 64, 128));
        panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.setBackground(new Color(0, 128, 64));
        ingresoPorSeleccion = new JLabel("Ingreso por selección");
        ingresoPorSeleccion.setForeground(Color.WHITE);
        ingresoPorSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
        panelSuperior.add(ingresoPorSeleccion, BorderLayout.PAGE_START);
        panelIngresoPorSeleccion = new JPanel();
        panelIngresoPorSeleccion.setLayout(new GridLayout(2, 2));

        String[] dias = {"Sábado", "Viernes", "Jueves", "Miércoles", "Martes",
                         "Lunes", "Domingo"};

        comboBox = new JComboBox(dias);
        comboBox.setToolTipText("JComboBox");
        panelComboBox = new JPanel();
        panelComboBox.setLayout(new GridBagLayout());
        panelComboBox.add(comboBox, new GridBagConstraints());
        panelComboBox.setBackground(new Color(192, 255, 192));
        panelIngresoPorSeleccion.add(panelComboBox);

        list = new JList(dias);
        list.setToolTipText("JList");
        scrollPaneList = new JScrollPane(list);
        scrollPaneList.setPreferredSize(new Dimension(80, 60));
        panelList = new JPanel();
        panelList.setLayout(new GridBagLayout());
        panelList.add(scrollPaneList, new GridBagConstraints());
        panelList.setBackground(new Color(255, 192, 192));
        panelIngresoPorSeleccion.add(panelList);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setToolTipText("JSlider");
        panelSlider = new JPanel();
        panelSlider.setLayout(new GridBagLayout());
        panelSlider.add(slider, new GridBagConstraints());
        panelSlider.setBackground(new Color(192, 192, 255));
        panelIngresoPorSeleccion.add(panelSlider);

        SpinnerListModel modeloDias = new SpinnerListModel(dias);
        spinner = new JSpinner(modeloDias);
        spinner.setPreferredSize(new Dimension(80, 25));
        spinner.setToolTipText("JSpinner");
        panelSpinner = new JPanel();
        panelSpinner.setLayout(new GridBagLayout());
        panelSpinner.add(spinner, new GridBagConstraints());
        panelSpinner.setBackground(new Color(192, 192, 192));
        panelIngresoPorSeleccion.add(panelSpinner);

        panelSuperior.add(panelIngresoPorSeleccion, BorderLayout.CENTER);

        visualizacionDeModelos = new JLabel("Visualización de modelos");
        visualizacionDeModelos.setForeground(Color.WHITE);
        visualizacionDeModelos.setHorizontalAlignment(SwingConstants.CENTER);
        panelInferior.add(visualizacionDeModelos, BorderLayout.PAGE_START);

        panelVisualizacionDeModelos = new JPanel();
        panelVisualizacionDeModelos.setLayout(new GridLayout(1, 2));

        String[] columnas = {"Nombre", "Apellido", "DNI"};
        Object[][] datos = {{"Santiago", "Lima", 20146853},
            {"Antonia", "Arroyo", 31046772}, {"Sandra", "Luppi", 23065768},
            {"Susana", "Torio", 28011727}, {"Esteban", "Quito", 17271884}};
        table = new JTable(datos, columnas);
        table.setToolTipText("JTable");
        table.getTableHeader().setBackground(Color.BLUE);
        table.getTableHeader().setForeground(Color.WHITE);
        scrollPaneTable = new JScrollPane(table);
        scrollPaneTable.setPreferredSize(new Dimension(230, 90));
        panelTable = new JPanel();
        panelTable.setLayout(new GridBagLayout());
        panelTable.add(scrollPaneTable, new GridBagConstraints());
        panelTable.setBackground(new Color(128, 255, 192));
        panelVisualizacionDeModelos.add(panelTable);

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Informática");
        DefaultMutableTreeNode año = new DefaultMutableTreeNode("Primer Año");

        año.add(new DefaultMutableTreeNode("Programación I"));
        año.add(new DefaultMutableTreeNode("Inglés Técnico I"));
        año.add(new DefaultMutableTreeNode("Análisis Matemático I"));
        año.add(new DefaultMutableTreeNode("Laboratorio"));
        top.add(año);

        año = new DefaultMutableTreeNode("Segundo Año");
        año.add(new DefaultMutableTreeNode("Programación II"));
        año.add(new DefaultMutableTreeNode("Sistemas de Computación I"));
        año.add(new DefaultMutableTreeNode("Estructuras y Bases de Datos"));
        top.add(año);

        año = new DefaultMutableTreeNode("Tercer Año");
        año.add(new DefaultMutableTreeNode("Programación III"));
        año.add(new DefaultMutableTreeNode("Sistemas de Computación II"));
        año.add(new DefaultMutableTreeNode("Seminario"));
        top.add(año);

        tree = new JTree(top);
        tree.setToolTipText("JTree");

        scrollPaneTree = new JScrollPane(tree);
        scrollPaneTree.setPreferredSize(new Dimension(230, 90));
        panelTree = new JPanel();
        panelTree.setLayout(new GridBagLayout());
        panelTree.add(scrollPaneTree, new GridBagConstraints());
        panelTree.setBackground(new Color(192, 128, 255));
        panelVisualizacionDeModelos.add(panelTree);

        panelInferior.add(panelVisualizacionDeModelos, BorderLayout.CENTER);

        progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        panelInferior.add(progressBar, BorderLayout.PAGE_END);

        splitPane =
               new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelSuperior, panelInferior);
        splitPane.setDividerLocation(150);

        tabbedPane.addTab("Botones", null, panel, "Componentes clicables");
        tabbedPane.addTab("Casillas de texto", null, panelConBorde,
                          "Componentes para ingresar textos");
        tabbedPane.addTab("Otros", null, splitPane, "Otros componentes");

        menuBar = new JMenuBar();
        menuBar.setLayout(fL);
        menuBar.setBackground(new Color(192, 192, 192));
        verMenu = new JMenu("Ver");
        ayudaMenu = new JMenu("Ayuda");
        separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setPreferredSize(new Dimension(1, 12));

        jCheckBoxMenuItem = new JCheckBoxMenuItem("Con compresión");
        resolucionMenu = new JMenu("Resolución");
        jRadioButtonMenuItem1 = new JRadioButtonMenuItem("640x480");
        jRadioButtonMenuItem2 = new JRadioButtonMenuItem("800x600");
        jRadioButtonMenuItem3 = new JRadioButtonMenuItem("1024x768");
        bG2 = new ButtonGroup();
        bG2.add(jRadioButtonMenuItem1);
        bG2.add(jRadioButtonMenuItem2);
        bG2.add(jRadioButtonMenuItem3);

        soloTextoMenuItem1 = new JMenuItem("Asistencia en línea");
        soloTextoMenuItem2 = new JMenuItem("Acerca de...");

        verMenu.add(jCheckBoxMenuItem);
        verMenu.addSeparator();
        resolucionMenu.add(jRadioButtonMenuItem1);
        resolucionMenu.add(jRadioButtonMenuItem2);
        resolucionMenu.add(jRadioButtonMenuItem3);
        verMenu.add(resolucionMenu);

        ayudaMenu.add(soloTextoMenuItem1);
        ayudaMenu.add(soloTextoMenuItem2);

        menuBar.add(verMenu);
        menuBar.add(separator);
        menuBar.add(ayudaMenu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(tabbedPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.pack();
   //     frame.setResizable(false);
        frame.setVisible(true);
    }
}






















