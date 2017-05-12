package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class KimnatneResultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Nazva;
	private JButton b_Nazad;

	private boolean boolean_kartunka1 = true;
	private boolean boolean_kartunka2 = true;
	private boolean boolean_kartunka3 = true;
	private boolean boolean_kartunka4 = true;

	private boolean boolean_Bonsai_Kartunka1 = true;
	private boolean boolean_Bonsai_Kartunka2 = true;

	private JLabel l_ZumSad_kartunka1;
	private Panel panel_ZumSad;
	private JLabel l_ZumSad_kartunka2;
	private JLabel l_ZumSad_kartunka3;
	private JLabel l_ZumSad_kartunka4;
	private JLabel l_ZumSad;
	private JScrollPane scrollPane;
	private Panel panel_Prukmetu;
	private Panel panel_Hvorobu;
	private Panel panel_Bonsai;
	private Panel panel_Hkidnuku;
	private Panel panel_Kupivla;
	private Panel panel_Rozmnogenna;
	private Panel panel_Doglad;
	private JLabel l_fon;
	private JLabel l_Bonsai_Kartunka1;
	private JLabel l_Bonsai_Kartunka2;
	private JLabel l_Bonsai;
	private JScrollPane scrollPane_1;
	private JLabel l_fonKupivli;
	private JLabel l_Galsad;
	private JLabel l_Galsad_logo;
	private JLabel l_Florium;
	private JLabel l_2_logo;
	private JLabel l_Landscape;
	private JLabel l_4_logo;
	private JLabel l_Greensad;
	private JLabel l_3_logo;
	private JLabel l_Bigl;
	private JLabel l_5_logo;

	Desktop desktop = Desktop.getDesktop();

	private JLabel l_Komentar;

	private JPanel panel_KohannaScasta;
	private JTextPane textPane_Text;
	private JRadioButton rB_5;
	private JRadioButton rB_6;
	private JRadioButton rB_3;
	private JRadioButton rB_4;
	private JRadioButton rB_2;
	private JRadioButton rB_1;
	private JPanel panel_UdacaDostatok;
	private JLabel l_Kartunka;
	private ButtonGroup group_Prukmetu1;
	private ButtonGroup group_Prukmetu2;
	private JScrollPane scrollPane_2;

	String s_Prukmetu1_1 = "Товстянка (крассула) або ж просто «грошове дерево» є одним з найвідоміших грошових символів. Листя, що за формою нагадують монети, символізують стабільність, постійне зростання, надійні результати. Якщо листя на рослині дрібне - буде дзвеніти в кишені дріб'язок, якщо велике, то в кишені будуть хрустіти паперові купюри. А вже якщо товстянка зацвіла - з упевненістю очікуйте багатства. Рослина не надто вимоглива до умов і потребує простого, але регулярного догляду - помірного поливу подалі від палючого сонця. Як варіант можна придбати заміокулькас (доларове дерево). Це також досить невибаглива рослина, що побратимом грошового дерева.";
	String s_Prukmetu1_2 = "«Бамбук щастя» або «щасливий бамбук» - це популярна назва драцени Сандера - багаторічної декоративної рослини. Бамбук - символізує швидке зростання і бурхливий розвиток. У Китаї вірять, що на всіх мешканців будинку, в якому є ця рослина, чекає удача, процвітання і щастя в сімейному житті. Ця невибаглива рослина потребує мінімального догляду. Любить розсіяне світло - під прямими сонячними променями листя може отримати опік. Обожнює воду, може рости в ній навіть без грунту. Тому головне - вчасно і рясно поливати, особливо влітку.";
	String s_Prukmetu1_3 = "Бугенвілія пов'язана з енергією і могутністю грошей та з фінансами вцілому. Особливо це квітуча рослина любить допомагати тим, хто вміє скористатися удачею і вчасно повернути колесо фортуни в потрібний бік. Бугенвілія допомагає оздоровити ситуацію в бізнесі, оживити грошові потоки і впоратися із застоєм у справах. Ця рослина вимагає яскравого світла. Вона чудово себе почуває на прямому сонці і при легкому затіненні. При таких умовах приквітки з’являються регулярно і довго не опадають. Ці ліани скидають частину листя в зимовий період, однак при недоліку освітлення їй притаманне скидання майже всього листя, в будь-який час. \n"
			+ "Прості й відомі всім рослини - герань, азалія й бегонія - допомагають домогтися в житті успіху. В азіатських країнах вірять, що якщо в домі є азалія, то господарі будинку будуть жити довго й щасливо. Герань у сусідстві з азалією - джерело статку в домі. Причому їхнє сусідство - неодмінна умова для цього.";
	String s_Prukmetu1_4 = "Азалія - квітка лідерів, тому що поряд з фінансовою могутністю зміцнює силу духу, здоров'я, авторитет і вплив. Ця рослина в офісі або на робочому столі - ідеальний вибір для тих, хто вміє обертати обставини на свою користь. У догляді азалія досить таки примхлива – рекомендовано регулярно обприскувати її, підвищуючи вологість повітря і в міру потреби поливати. Застою поливної води і перезволоження ця рослина не терпить.";
	String s_Prukmetu1_5 = "Бегонія відрізняється рівним позитивним впливом і буде однаково корисна як в періоди піднесення, так і в моменти невдач, оскільки ця рослина допомагає істотно згладити кризи і втрати. Бегонія сприяє гармонії фінансового процвітання та благополуччя. Рослина потребує підвищеної вологості повітря в приміщенні, але обприскування бегонії вкрай не допустимо. При попаданні води на листок рослини швидко виникають коричневі плями.";
	String s_Prukmetu1_6 = "Цитрусові - це специфічні рослини, які залучають матеріальне благополуччя. Наприклад, назва лимона китайською збігається з позначенням золота, і тому це вважається дуже благополучним знаком. За своїм впливом цитрусові не пов'язані з авантюрами, надіями, багатообіцяючими шансами. Вони символізують плоди життя - її конкретні результати. Більшість цитрусових вибагливі, тому що не пристосовані до наших умов існування, а отже - потребують ретельного догляду.\n"
			+ "Крім цих рослини, приваблюють гроші в будинок наступні кімнатні квіти: аспарагус, астрофітум, юка, папороть. І звичайний кактус. З ним пов'язане ще одне народне повір'я: якщо в будинку є кактус, грабіжникам туди вхід закритий.\nЯкщо ці рослини будуть добре рости в оселі, гроші відразу потечуть у Ваш будинок. В іншому випадку ніколи не пізно відвідати квітковий магазин, і прикупити собі ще одну «грошовиту» рослинку ;)";

	String s_Prukmetu2_1 = "\"Жіноче щастя\" - спатифиллум. Кажуть, що спатифиллум цвіте в щасливому будинку. Більше того, своєю енергетикою це рослина сприяє налагодженню відносин. Cамотні люди обов'язково знайдуть свою другу половинку, а у молодих пар народяться діти. \"Жіноче щастя\" завжди приносить у дім взаєморозуміння й любов. Ніжний спатифиллум у всьому любить помірність. Кращі умови для нього - тепло, але не жарко, волого, але не вогко, сонячно, але не яскраво. Розмножують спатифиллум діленням куща при пересадці. Вирощувати його нескладно. Головне: обов'язково обприскуйте свій спатифиллум кожен день, а навесні - пересаджуйте в свіжу грунт.";
	String s_Prukmetu2_2 = "Фіалка - дуже гарна квітка з екзотичною назвою сенполія. У будинку, де росте ця квітка, менше сваряться. Фіалка допомагає підтримувати мир в сім'ї. Також ця квітка вважається символом вічного кохання. Фіалки, як усім відомо, люблять ретельний догляд, їм потрібно багато світла, вони не терплять жорстку воду. Не завадить їй гарний дренаж (навіть половину горщику можна засипати ним). Поливати фіалку слід не зверху (так гниє коріння та листя), а знизу і трішки підігрітою водою. Отож, найбільшою шкодою для фіалки є: потрапляння прямого сонячного проміння та надто часте поливання рослини зверху вазона.";
	String s_Prukmetu2_3 = "Китайська троянда або гібіскус. На Гаваях - це \"квітка прекрасних жінок\". Усім подобаються її красиві і великі квіти. Якщо у вас в будинку з'явиться гібіскус, чекайте на пристрасне кохання. Через велику любов до вологи, гібіскус ще називають \"болотяною мальвою\". Досить цікаво, саме гібіскус китайський добре освіжає та очищує повітря. Він відновлююче впливає на хворі та пониклі рослини, що ростуть поряд з ним. Доглядати за рослиною слід наступним чином: ставте вазон у добре освітленому, але не сонячному місці. В теплі дні можна винести його на свіже повітря (балкон, сад). Якщо у вас немає такої можливості, то пам’ятайте про регулярне провітрювання кімнати. Як бачимо освітлення для гібіскуса є дуже важливим, в іншому випадку рослина може зовсім не цвісти.";
	String s_Prukmetu2_4 = "Мирт - це вічнозелений чагарник з маленькими білими квітами. Він володіє, крім краси, ще цілющими властивостями. Саме слово «мирт» перекладається з грецької як «бальзам». В античному світі мирт вважався символом безсмертя і любові. Мирт робить шлюб вдалим, а в сформовану вже сім'ю приносить щастя і мир. У деяких країнах це рослина навіть вважається кращим подарунком для молодят. Мирту не завадить яскраве, але розсіяне світло. Взимку його розміщають в найбільш освітлені місця. Вазон можна виставляти на відкрите повітря, в місце, куди не потрапляють промені прямого південного сонця. Найкраще рослині у прохолодних приміщеннях. В іншому випадку, при теплому й сухому повітрі, мирт скидає листочки.";
	String s_Prukmetu2_5 = "Аїхрізон - кімнатна квітка. Рослина Аїхрізон відноситься до сімейства товстянкових. Народні прізвиська - \"дерево любові\" і \"дерево щастя\". Це кімнатна квітка, яка може вирости до 30 см у висоту. У нього своєрідне листя, схожі за формою на сердечка. Аїхрізон приносить любов і щастя своєму власникові. У догляді не надто вимогливий. Рослина любить яскраве, розсіяне світло, але без потрапляння прямих сонячних променів. Для рівномірного росту вазон час від часу слід повертати у різні сторони. Грунт підійде будь-який. Щоб рослина зацвіла, необхідно створити взимку потрібні умови. Поставити в прохолодне, світле місце. Стежити за поливом: не заливати і використовувати теплу воду. ";
	String s_Prukmetu2_6 = "Хойя, або « воскової плющ » - кімнатна ліана. У рослини безліч різновидів. Наприклад, є хойя Керрі, яка в деяких країнах дарується як « валентинка » на 14 лютого. Хойя принесе вам сімейне щастя, особливо якщо ви поставите її в свою спальню. Поливати хойю слід 1 раз в тиждень, зовсім трішки обприскувати. А от перезволоження вазону зовсім не на користь, про це він розповість вам формою своїх листочків. Якщо вони скручені до низу – зменшіть частоту поливу. До речі, листя буде в’янути і при поганому освітленні.";
	String s_Prukmetu2_7 = "Калатея - красива і невибаглива рослина для тих, хто шукає щастя. У калатеї красиві і незвичайні візерункові листя, розцяцьковані в химерні різноманітні малюнки. Ця рослина вважається символом і оберегом домашнього щастя. Ідеальним для калатеї вважається температурний режим в межах 18 – 25 °C (влітку до 30 °C) з температурою ґрунту не нижче 18 – 20 °C, а більш прохолодний зміст, особливо в зимовий період і в поєднанні з обприскуванням листя, часто стає причиною загнивання і загибелі рослини. На підвіконнях під прямим сонцем калатея швидко втрачає декоративність – в кращому випадку листя бліднуть або набувають коричнево-червоний колір, а в гіршому – засихають і опадають. Тому краще розмістити рослину всередині кімнати.";
	String s_Prukmetu2_8 = "Хлорофітум - \"сімейне щастя\" - одне з найпопулярніших ампельних кімнатних рослин. У народі кажуть, що з хлорофітум сімейне життя буде спокійною і, звичайно ж, щасливою. За цією рослиною легко доглядати. Воно добре росте і красиво цвіте. Рослина дуже стійка, практично нечутлива до коливань температури, вона однаково добре зростає в теплих і холодних кімнатах. Прямі сонячні промені і сухе повітря не несуть загрози хлорофітуму. Рослина не вимагає обприскування, без особливих проблем витримує низьку вологість повітря, тільки влітку поливайте його побільше. ";
	String s_Prukmetu2_9 = "Кислиця (Оксаліс) - рослина досить не примхлива і дуже красива. У соку кислиці присутній щавлева кислота, тому вона і має таку назву. Її можна вирощувати і в кімнаті, і в саду. Якщо вам необхідно знайти своє кохання або зберегти сім'ю, заведіть у будинку кислиці. Якщо ж Ви бажаєте споглядати буйне розростання цієї рослини цілий рік, то для цього потрібно часто змінювати грунт (весна і осінь - пересадка, видалення дрібних, старих бульб), підгодовувати Ваше рослина в проміжках між пересадками і забезпечити вологість і не яскравий розсіяний світло.";
	String s_Prukmetu2_10 = "Антуріум (\"Чоловіче щастя\") - квітка, схожа на спатіфілума, але вогненно-червоного кольору. Він приносить щастя і успіх в любові, а чоловікам - \"чоловічу силу\". Доглядати за рослиною дуже просто: містити в теплі, добре поливати, підгодовувати рідким добривом раз на 2-3 тижні навесні і влітку. Тоді антуріум зацвіте і радуватиме 3-4 місяці. Починаючи в пізньої осені і всю зиму рослина не \"годують\". Пересаджують антуріум щорічно навесні: переносять разом із земляною грудкою в новий горщик , відокремлюючи нові кущики. Основні правила посадки: чи не заглиблювати надмірно в землю точку росту і не травмувати «повітряні » коріння. Він не виносить прямих сонячних променів, вимагає частого обприскування і має схильність до високої вологості. І що дуже важливо - отруйний!";

	private JLabel l_fonKimnatneUdacaDostatok;
	private JLabel l_fonKimnatne;
	private JRadioButton rB_Prukmet2_9;
	private JRadioButton rB_Prukmet2_10;
	private JRadioButton rB_Prukmet2_6;
	private JRadioButton rB_Prukmet2_8;
	private JRadioButton rB_Prukmet2_5;
	private JRadioButton rB_Prukmet2_7;
	private JRadioButton rB_Prukmet2_4;
	private JRadioButton rB_Prukmet2_3;
	private JRadioButton rB_Prukmet2_2;
	private JRadioButton rB_Prukmet2_1;
	private JTextPane textPane_TextScasta;
	private JLabel label_KartunkaScasta;
	private JPanel panel_Hkidnuku9;
	private JPanel panel_Hkidnuku2;
	private JPanel panel_Hkidnuku3;
	private JPanel panel_Hkidnuku8;
	private JPanel panel_Hkidnuku4;
	private JPanel panel_Hkidnuku5;
	private JPanel panel_Hkidnuku6;
	private JPanel panel_Hkidnuku7;
	private JLabel l_Hkidnuku9;
	private JScrollPane scrollPane_3;
	private JLabel l_Hkidnuku4;
	private JScrollPane scrollPane_6;
	private JScrollPane scrollPane_7;
	private JLabel l_Hkidnuku5;
	private JScrollPane scrollPane_8;
	private JLabel l_Hkidnuku6;
	private JScrollPane scrollPane_9;
	private JLabel l_Hkidnuku7;
	private JScrollPane scrollPane_10;
	private JLabel l_Hkidnuku8;
	private JScrollPane scrollPane_11;
	private JPanel panel_Hkidnuku10;
	private JPanel panel_Hkidnuku11;
	private JPanel panel_Hkidnuku12;
	private JLabel l_Hkidnuku10;
	private JScrollPane scrollPane_12;
	private JLabel l_Hkidnuku11;
	private JScrollPane scrollPane_13;
	private JLabel l_Hkidnuku12;
	private JScrollPane scrollPane_14;

	public KimnatneResultatu(String string, int i_putanna1, int i_putanna2, int i_putanna3, int i_slider_putanna4,
			int i_slider_putanna5, int i_putanna6, int i_putanna7, int i_putanna8, int i_checkBox1_0, int i_checkBox1_1,
			int i_checkBox1_2, int i_checkBox1_3, int i_checkBox1_4, int i_checkBox1_5, int i_checkBox1_6,
			int i_checkBox1_7, int i_checkBox1_8, int i_checkBox1_9, int i_checkBox1_10, int i_checkBox1_11,
			int i_checkBox2_0, int i_checkBox2_1, int i_checkBox2_2, int i_checkBox2_3, int i_checkBox2_4,
			int i_checkBox2_5, int i_checkBox3_0, int i_checkBox3_1, int i_checkBox3_2, int i_checkBox3_3,
			int i_checkBox3_4, int i_checkBox3_5, int i_checkBox4_0, int i_checkBox4_1, int i_checkBox4_2,
			int i_checkBox4_3, int i_checkBox4_4, int i_checkBox4_5, int i_checkBox4_6, int i_checkBox4_7,
			int i_checkBox4_8, int i_checkBox4_9, int i_checkBox4_10) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Nazva = new JLabel("Кімнатне розслинництво");
		l_Nazva.setBounds(0, 0, 794, 52);
		l_Nazva.setForeground(Color.RED);
		l_Nazva.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 40));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(l_Nazva);

		b_Nazad = new JButton("Меню");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Рослинне господпрство");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 63, 770, 489);
		getContentPane().add(tabbedPane);

		if (i_putanna1 == 1) {
			panel_ZumSad = new Panel();
			tabbedPane.addTab("Зимовий сад / Оранжерея", null, panel_ZumSad, null);
			panel_ZumSad.setLayout(null);

			l_ZumSad_kartunka1 = new JLabel("");
			l_ZumSad_kartunka1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka1 == true) {
						l_ZumSad_kartunka1.setBounds(0, 0, 542, 459);
						l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.1.jpg"));
						boolean_kartunka1 = false;
					} else {
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
						boolean_kartunka1 = true;
					}
				}
			});
			l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
			l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
			panel_ZumSad.add(l_ZumSad_kartunka1);

			l_ZumSad_kartunka2 = new JLabel("");
			l_ZumSad_kartunka2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka2 == true) {
						l_ZumSad_kartunka2.setBounds(0, 0, 640, 459);
						l_ZumSad_kartunka1.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.1.jpg"));
						boolean_kartunka2 = false;
					} else {
						l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
						boolean_kartunka2 = true;
					}
				}
			});
			l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
			l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
			panel_ZumSad.add(l_ZumSad_kartunka2);

			l_ZumSad_kartunka3 = new JLabel("");
			l_ZumSad_kartunka3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka3 == true) {
						l_ZumSad_kartunka3.setBounds(0, 0, 640, 459);
						l_ZumSad_kartunka2.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka1.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.1.jpg"));
						boolean_kartunka3 = false;
					} else {
						l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
						l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
						boolean_kartunka3 = true;
					}
				}
			});
			l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
			l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
			panel_ZumSad.add(l_ZumSad_kartunka3);

			l_ZumSad_kartunka4 = new JLabel("");
			l_ZumSad_kartunka4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka4 == true) {
						l_ZumSad_kartunka4.setBounds(408, 0, 360, 459);
						l_ZumSad_kartunka3.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.1.jpg"));
						boolean_kartunka4 = false;
					} else {
						l_ZumSad_kartunka4.setBounds(637, 292, 131, 167);
						l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
						l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
						boolean_kartunka4 = true;
					}
				}
			});
			l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
			l_ZumSad_kartunka4.setBounds(637, 292, 131, 167);
			panel_ZumSad.add(l_ZumSad_kartunka4);

			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 765, 291);
			panel_ZumSad.add(scrollPane);

			l_ZumSad = new JLabel("");
			scrollPane.setViewportView(l_ZumSad);
			l_ZumSad.setIcon(new ImageIcon("res/ZumSad.PNG"));
		}
		if (i_putanna2 == 1) {
			panel_Bonsai = new Panel();
			tabbedPane.addTab("Бонсай / суісекі", null, panel_Bonsai, null);
			panel_Bonsai.setLayout(null);

			l_Bonsai_Kartunka1 = new JLabel("");
			l_Bonsai_Kartunka1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_Bonsai_Kartunka1 == true) {
						l_Bonsai_Kartunka1.setBounds(420, 0, 345, 459);
						l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.1.jpg"));
						boolean_Bonsai_Kartunka1 = false;
					} else {
						l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
						l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.jpg"));
						boolean_Bonsai_Kartunka1 = true;
					}
				}
			});
			l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
			l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.jpg"));
			panel_Bonsai.add(l_Bonsai_Kartunka1);

			l_Bonsai_Kartunka2 = new JLabel("");
			l_Bonsai_Kartunka2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_Bonsai_Kartunka2 == true) {
						l_Bonsai_Kartunka2.setBounds(420, 0, 345, 459);
						l_Bonsai_Kartunka1.setBounds(0, 0, 0, 0);
						l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.1.jpg"));
						boolean_Bonsai_Kartunka2 = false;
					} else {
						l_Bonsai_Kartunka2.setBounds(555, 229, 210, 230);
						l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
						l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.jpg"));
						boolean_Bonsai_Kartunka2 = true;
					}
				}
			});
			l_Bonsai_Kartunka2.setBounds(555, 229, 210, 230);
			l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.jpg"));
			panel_Bonsai.add(l_Bonsai_Kartunka2);

			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(0, 0, 553, 459);
			panel_Bonsai.add(scrollPane_1);

			l_Bonsai = new JLabel("");
			scrollPane_1.setViewportView(l_Bonsai);
			l_Bonsai.setIcon(new ImageIcon("res/Bonsai.PNG"));
		}

		if (i_slider_putanna4 >= 50) {

			panel_Prukmetu = new Panel();
			tabbedPane.addTab("Прикмети", null, panel_Prukmetu, null);
			panel_Prukmetu.setLayout(null);

			JTabbedPane tabbedPane_Prukmetu = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_Prukmetu.setBounds(0, 0, 765, 459);
			panel_Prukmetu.add(tabbedPane_Prukmetu);

			panel_UdacaDostatok = new JPanel();
			tabbedPane_Prukmetu.addTab("Рослини, що приносять удачу та достаток", null, panel_UdacaDostatok, null);
			panel_UdacaDostatok.setLayout(null);

			l_Kartunka = new JLabel("");
			l_Kartunka.setBounds(310, 0, 450, 338);
			l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			panel_UdacaDostatok.add(l_Kartunka);

			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(0, 0, 310, 338);
			panel_UdacaDostatok.add(scrollPane_2);

			textPane_Text = new JTextPane();
			scrollPane_2.setViewportView(textPane_Text);
			textPane_Text.setText(s_Prukmetu1_1);

			rB_1 = new JRadioButton("Товстянка");
			rB_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_1.setForeground(Color.WHITE);
			rB_1.setBounds(42, 356, 194, 25);
			rB_1.setSelected(true);
			rB_1.setOpaque(false);
			panel_UdacaDostatok.add(rB_1);
			rB_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_1);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
				}
			});

			rB_2 = new JRadioButton("«Бамбук щастя»");
			rB_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_2.setForeground(Color.WHITE);
			rB_2.setBounds(42, 386, 194, 25);
			panel_UdacaDostatok.add(rB_2);
			rB_2.setOpaque(false);
			rB_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_2);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu2.jpg"));
				}
			});

			rB_4 = new JRadioButton("Азалія");
			rB_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_4.setForeground(Color.WHITE);
			rB_4.setBounds(308, 386, 194, 25);
			panel_UdacaDostatok.add(rB_4);
			rB_4.setOpaque(false);
			rB_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_4);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu4.jpg"));
				}
			});

			rB_3 = new JRadioButton("Бугенвілія");
			rB_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_3.setForeground(Color.WHITE);
			rB_3.setBounds(308, 356, 194, 25);
			panel_UdacaDostatok.add(rB_3);
			rB_3.setOpaque(false);
			rB_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_3);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu3.jpg"));
				}
			});

			rB_6 = new JRadioButton("Цитрусові");
			rB_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_6.setForeground(Color.WHITE);
			rB_6.setBounds(566, 386, 194, 25);
			panel_UdacaDostatok.add(rB_6);
			rB_6.setOpaque(false);
			rB_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_6);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu6.jpg"));
				}
			});

			rB_5 = new JRadioButton("Бегонія");
			rB_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_5.setForeground(Color.WHITE);
			rB_5.setBounds(566, 356, 194, 25);
			panel_UdacaDostatok.add(rB_5);
			rB_5.setOpaque(false);
			rB_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_Text.setText(s_Prukmetu1_5);
					l_Kartunka.setIcon(new ImageIcon("res/Prukmetu5.jpg"));
				}
			});

			group_Prukmetu1 = new ButtonGroup();
			group_Prukmetu1.add(rB_1);
			group_Prukmetu1.add(rB_2);
			group_Prukmetu1.add(rB_3);
			group_Prukmetu1.add(rB_4);
			group_Prukmetu1.add(rB_5);
			group_Prukmetu1.add(rB_6);

			l_fonKimnatne = new JLabel("");
			l_fonKimnatne.setBounds(0, 0, 765, 459);
			l_fonKimnatne.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			panel_Prukmetu.add(l_fonKimnatne);

			l_fonKimnatneUdacaDostatok = new JLabel("");
			l_fonKimnatneUdacaDostatok.setBounds(0, 0, 765, 459);
			l_fonKimnatneUdacaDostatok.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			panel_UdacaDostatok.add(l_fonKimnatneUdacaDostatok);

			panel_KohannaScasta = new JPanel();
			tabbedPane_Prukmetu.addTab("Рослини, що приносять кохання та щастя", null, panel_KohannaScasta, null);
			panel_KohannaScasta.setLayout(null);

			textPane_TextScasta = new JTextPane();
			textPane_TextScasta.setText(s_Prukmetu2_4);
			textPane_TextScasta.setBounds(1, 1, 357, 299);
			panel_KohannaScasta.add(textPane_TextScasta);

			label_KartunkaScasta = new JLabel("");
			label_KartunkaScasta.setBounds(360, 0, 400, 300);
			label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_4.jpg"));
			panel_KohannaScasta.add(label_KartunkaScasta);

			rB_Prukmet2_1 = new JRadioButton("\"Жіноче щастя\"");
			rB_Prukmet2_1.setOpaque(false);
			rB_Prukmet2_1.setForeground(Color.WHITE);
			rB_Prukmet2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_1.setBounds(549, 386, 211, 25);
			panel_KohannaScasta.add(rB_Prukmet2_1);
			rB_Prukmet2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_1);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_1.jpg"));
				}
			});

			rB_Prukmet2_2 = new JRadioButton("Фіалка");
			rB_Prukmet2_2.setOpaque(false);
			rB_Prukmet2_2.setForeground(Color.WHITE);
			rB_Prukmet2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_2.setBounds(125, 386, 120, 25);
			panel_KohannaScasta.add(rB_Prukmet2_2);
			rB_Prukmet2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_2);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_2.jpg"));
				}
			});

			rB_Prukmet2_3 = new JRadioButton("Китайська троянда");
			rB_Prukmet2_3.setOpaque(false);
			rB_Prukmet2_3.setForeground(Color.WHITE);
			rB_Prukmet2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_3.setBounds(549, 345, 211, 25);
			panel_KohannaScasta.add(rB_Prukmet2_3);
			rB_Prukmet2_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_3);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_3.jpg"));
				}
			});

			rB_Prukmet2_4 = new JRadioButton("Мирт");
			rB_Prukmet2_4.setSelected(true);
			rB_Prukmet2_4.setOpaque(false);
			rB_Prukmet2_4.setForeground(Color.WHITE);
			rB_Prukmet2_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_4.setBounds(1, 345, 120, 25);
			panel_KohannaScasta.add(rB_Prukmet2_4);
			rB_Prukmet2_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_4);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_4.jpg"));
				}
			});

			rB_Prukmet2_7 = new JRadioButton("Калатея");
			rB_Prukmet2_7.setOpaque(false);
			rB_Prukmet2_7.setForeground(Color.WHITE);
			rB_Prukmet2_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_7.setBounds(125, 345, 153, 25);
			panel_KohannaScasta.add(rB_Prukmet2_7);
			rB_Prukmet2_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_7);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_7.jpg"));
				}
			});

			rB_Prukmet2_8 = new JRadioButton("Хлорофітум");
			rB_Prukmet2_8.setOpaque(false);
			rB_Prukmet2_8.setForeground(Color.WHITE);
			rB_Prukmet2_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_8.setBounds(392, 386, 153, 25);
			panel_KohannaScasta.add(rB_Prukmet2_8);
			rB_Prukmet2_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_8);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_8.jpg"));
				}
			});

			rB_Prukmet2_5 = new JRadioButton("Аїхрізон");
			rB_Prukmet2_5.setOpaque(false);
			rB_Prukmet2_5.setForeground(Color.WHITE);
			rB_Prukmet2_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_5.setBounds(251, 345, 153, 25);
			panel_KohannaScasta.add(rB_Prukmet2_5);
			rB_Prukmet2_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_5);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_5.jpg"));
				}
			});

			rB_Prukmet2_6 = new JRadioButton("Хойя");
			rB_Prukmet2_6.setOpaque(false);
			rB_Prukmet2_6.setForeground(Color.WHITE);
			rB_Prukmet2_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_6.setBounds(1, 386, 120, 25);
			panel_KohannaScasta.add(rB_Prukmet2_6);
			rB_Prukmet2_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_6);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_6.jpg"));
				}
			});

			rB_Prukmet2_9 = new JRadioButton("Кислиця");
			rB_Prukmet2_9.setOpaque(false);
			rB_Prukmet2_9.setForeground(Color.WHITE);
			rB_Prukmet2_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_9.setBounds(251, 386, 120, 25);
			panel_KohannaScasta.add(rB_Prukmet2_9);
			rB_Prukmet2_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_9);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_9.jpg"));
				}
			});

			rB_Prukmet2_10 = new JRadioButton("Антуріум");
			rB_Prukmet2_10.setOpaque(false);
			rB_Prukmet2_10.setForeground(Color.WHITE);
			rB_Prukmet2_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			rB_Prukmet2_10.setBounds(392, 345, 153, 25);
			panel_KohannaScasta.add(rB_Prukmet2_10);
			rB_Prukmet2_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPane_TextScasta.setText(s_Prukmetu2_10);
					label_KartunkaScasta.setIcon(new ImageIcon("res/Prukmetu2_10.jpg"));
				}
			});

			group_Prukmetu2 = new ButtonGroup();
			group_Prukmetu2.add(rB_Prukmet2_1);
			group_Prukmetu2.add(rB_Prukmet2_2);
			group_Prukmetu2.add(rB_Prukmet2_3);
			group_Prukmetu2.add(rB_Prukmet2_4);
			group_Prukmetu2.add(rB_Prukmet2_5);
			group_Prukmetu2.add(rB_Prukmet2_6);
			group_Prukmetu2.add(rB_Prukmet2_7);
			group_Prukmetu2.add(rB_Prukmet2_8);
			group_Prukmetu2.add(rB_Prukmet2_9);
			group_Prukmetu2.add(rB_Prukmet2_10);

			l_fonKimnatneUdacaDostatok = new JLabel();
			l_fonKimnatneUdacaDostatok.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			l_fonKimnatneUdacaDostatok.setBounds(0, 0, 765, 459);
			panel_KohannaScasta.add(l_fonKimnatneUdacaDostatok);

		}
		if (i_putanna6 == 1) {
			panel_Hkidnuku = new Panel();
			tabbedPane.addTab("Шкідники", null, panel_Hkidnuku, null);
			panel_Hkidnuku.setLayout(null);

			JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1.setBounds(0, 0, 765, 459);
			panel_Hkidnuku.add(tabbedPane_1);

			JPanel panel_Hkidnuku1 = new JPanel();
			tabbedPane_1.addTab("Щитівки", null, panel_Hkidnuku1, null);
			panel_Hkidnuku1.setLayout(null);

			JScrollPane scrollPane_4 = new JScrollPane();
			scrollPane_4.setBounds(0, 0, 760, 411);
			panel_Hkidnuku1.add(scrollPane_4);

			JLabel l_Hkidnuku1 = new JLabel("");
			scrollPane_4.setViewportView(l_Hkidnuku1);
			l_Hkidnuku1.setIcon(new ImageIcon("res/Hkidnuku1.PNG"));

			panel_Hkidnuku2 = new JPanel();
			tabbedPane_1.addTab("Павутинний кліщ", null, panel_Hkidnuku2, null);
			panel_Hkidnuku2.setLayout(null);

			JScrollPane scrollPane_5 = new JScrollPane();
			scrollPane_5.setBounds(0, 0, 760, 411);
			panel_Hkidnuku2.add(scrollPane_5);

			JLabel l_Hkidnuku2 = new JLabel("");
			scrollPane_5.setViewportView(l_Hkidnuku2);
			l_Hkidnuku2.setIcon(new ImageIcon("res/Hkidnuku2.PNG"));

			panel_Hkidnuku3 = new JPanel();
			tabbedPane_1.addTab("Борошнистий червець", null, panel_Hkidnuku3, null);
			panel_Hkidnuku3.setLayout(null);

			scrollPane_6 = new JScrollPane();
			scrollPane_6.setBounds(0, 0, 760, 411);
			panel_Hkidnuku3.add(scrollPane_6);

			JLabel l_Hkidnuku3 = new JLabel("");
			scrollPane_6.setViewportView(l_Hkidnuku3);
			l_Hkidnuku3.setIcon(new ImageIcon("res/Hkidnuku3.PNG"));

			panel_Hkidnuku4 = new JPanel();
			tabbedPane_1.addTab("Білокрилка", null, panel_Hkidnuku4, null);
			panel_Hkidnuku4.setLayout(null);

			scrollPane_7 = new JScrollPane();
			scrollPane_7.setBounds(0, 0, 760, 411);
			panel_Hkidnuku4.add(scrollPane_7);

			l_Hkidnuku4 = new JLabel("");
			scrollPane_7.setViewportView(l_Hkidnuku4);
			l_Hkidnuku4.setIcon(new ImageIcon("res/Hkidnuku4.PNG"));

			panel_Hkidnuku5 = new JPanel();
			tabbedPane_1.addTab("Попелиця", null, panel_Hkidnuku5, null);
			panel_Hkidnuku5.setLayout(null);

			scrollPane_8 = new JScrollPane();
			scrollPane_8.setBounds(0, 0, 760, 411);
			panel_Hkidnuku5.add(scrollPane_8);

			l_Hkidnuku5 = new JLabel("");
			scrollPane_8.setViewportView(l_Hkidnuku5);
			l_Hkidnuku5.setIcon(new ImageIcon("res/Hkidnuku5.PNG"));

			panel_Hkidnuku6 = new JPanel();
			tabbedPane_1.addTab("Трипс", null, panel_Hkidnuku6, null);
			panel_Hkidnuku6.setLayout(null);

			scrollPane_9 = new JScrollPane();
			scrollPane_9.setBounds(0, 0, 760, 411);
			panel_Hkidnuku6.add(scrollPane_9);

			l_Hkidnuku6 = new JLabel("");
			scrollPane_9.setViewportView(l_Hkidnuku6);
			l_Hkidnuku6.setIcon(new ImageIcon("res/Hkidnuku7.PNG"));

			panel_Hkidnuku7 = new JPanel();
			tabbedPane_1.addTab("Нематода", null, panel_Hkidnuku7, null);
			panel_Hkidnuku7.setLayout(null);

			scrollPane_10 = new JScrollPane();
			scrollPane_10.setBounds(0, 0, 760, 411);
			panel_Hkidnuku7.add(scrollPane_10);

			l_Hkidnuku7 = new JLabel("");
			scrollPane_10.setViewportView(l_Hkidnuku7);
			l_Hkidnuku7.setIcon(new ImageIcon("res/Hkidnuku7.PNG"));

			panel_Hkidnuku8 = new JPanel();
			tabbedPane_1.addTab("Цикламеновий кліщ", null, panel_Hkidnuku8, null);
			panel_Hkidnuku8.setLayout(null);

			scrollPane_11 = new JScrollPane();
			scrollPane_11.setBounds(0, 0, 760, 411);
			panel_Hkidnuku8.add(scrollPane_11);

			l_Hkidnuku8 = new JLabel("");
			scrollPane_11.setViewportView(l_Hkidnuku8);
			l_Hkidnuku8.setIcon(new ImageIcon("res/Hkidnuku8.PNG"));

			panel_Hkidnuku9 = new JPanel();
			tabbedPane_1.addTab("Кореневий кліщ", null, panel_Hkidnuku9, null);
			panel_Hkidnuku9.setLayout(null);

			scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(0, 0, 760, 411);
			panel_Hkidnuku9.add(scrollPane_3);

			l_Hkidnuku9 = new JLabel("");
			scrollPane_3.setViewportView(l_Hkidnuku9);
			l_Hkidnuku9.setIcon(new ImageIcon("res/Hkidnuku9.PNG"));

			panel_Hkidnuku10 = new JPanel();
			tabbedPane_1.addTab("Мінер", null, panel_Hkidnuku10, null);
			panel_Hkidnuku10.setLayout(null);

			scrollPane_12 = new JScrollPane();
			scrollPane_12.setBounds(0, 0, 760, 411);
			panel_Hkidnuku10.add(scrollPane_12);

			l_Hkidnuku10 = new JLabel("");
			scrollPane_12.setViewportView(l_Hkidnuku10);
			l_Hkidnuku10.setIcon(new ImageIcon("res/Hkidnuku10.PNG"));

			panel_Hkidnuku11 = new JPanel();
			tabbedPane_1.addTab("Плоский кліщ", null, panel_Hkidnuku11, null);
			panel_Hkidnuku11.setLayout(null);

			scrollPane_13 = new JScrollPane();
			scrollPane_13.setBounds(0, 0, 760, 411);
			panel_Hkidnuku11.add(scrollPane_13);

			l_Hkidnuku11 = new JLabel("");
			l_Hkidnuku11.setIcon(new ImageIcon("res/Hkidnuku11.PNG"));
			scrollPane_13.setViewportView(l_Hkidnuku11);

			panel_Hkidnuku12 = new JPanel();
			tabbedPane_1.addTab("Бріобія", null, panel_Hkidnuku12, null);
			panel_Hkidnuku12.setLayout(null);

			scrollPane_14 = new JScrollPane();
			scrollPane_14.setBounds(0, 0, 760, 411);
			panel_Hkidnuku12.add(scrollPane_14);

			l_Hkidnuku12 = new JLabel("");
			l_Hkidnuku12.setIcon(new ImageIcon("res/Hkidnuku12.PNG"));
			scrollPane_14.setViewportView(l_Hkidnuku12);

			l_fonKimnatne = new JLabel("");
			l_fonKimnatne.setBounds(0, 0, 765, 459);
			l_fonKimnatne.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			panel_Hkidnuku.add(l_fonKimnatne);

		}

		panel_Hvorobu = new Panel();
		tabbedPane.addTab("Хвороби", null, panel_Hvorobu, null);

		panel_Rozmnogenna = new Panel();
		tabbedPane.addTab("Розмноження", null, panel_Rozmnogenna, null);

		if (i_putanna3 == 1) {
			panel_Kupivla = new Panel();
			tabbedPane.addTab("Купівля", null, panel_Kupivla, null);
			panel_Kupivla.setLayout(null);

			l_Galsad = new JLabel("Galsad");
			l_Galsad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://galsad.com.ua/goods.php/kimnatni/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Galsad.setHorizontalAlignment(SwingConstants.CENTER);
			l_Galsad.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Galsad.setForeground(Color.MAGENTA);
			l_Galsad.setBounds(41, 48, 193, 57);
			panel_Kupivla.add(l_Galsad);

			l_Galsad_logo = new JLabel("");
			l_Galsad_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://galsad.com.ua/goods.php/kimnatni/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Galsad_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_Galsad_logo.setBounds(421, 0, 226, 105);
			l_Galsad_logo.setIcon(new ImageIcon("res/KupivlaKartunka1.png"));
			panel_Kupivla.add(l_Galsad_logo);

			l_Florium = new JLabel("Florium");
			l_Florium.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("https://florium.ua/ua/room-bulbs/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Florium.setHorizontalAlignment(SwingConstants.CENTER);
			l_Florium.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Florium.setForeground(Color.MAGENTA);
			l_Florium.setBounds(41, 127, 193, 57);
			panel_Kupivla.add(l_Florium);

			l_2_logo = new JLabel("");
			l_2_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("https://florium.ua/ua/room-bulbs/"));
					} catch (Exception e1) {
					}
				}
			});
			l_2_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_2_logo.setBounds(421, 118, 226, 66);
			l_2_logo.setIcon(new ImageIcon("res/KupivlaKartunka2.jpg"));
			panel_Kupivla.add(l_2_logo);

			l_Landscape = new JLabel("Landscape");
			l_Landscape.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://landscape.ua/ua/komnatnye-rasteniya"));
					} catch (Exception e1) {
					}
				}
			});
			l_Landscape.setHorizontalAlignment(SwingConstants.CENTER);
			l_Landscape.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Landscape.setForeground(Color.MAGENTA);
			l_Landscape.setBounds(41, 283, 193, 57);
			panel_Kupivla.add(l_Landscape);

			l_4_logo = new JLabel("");
			l_4_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://landscape.ua/ua/komnatnye-rasteniya"));
					} catch (Exception e1) {
					}
				}
			});
			l_4_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_4_logo.setBounds(421, 283, 226, 57);
			l_4_logo.setIcon(new ImageIcon("res/KupivlaKartunka4.png"));
			panel_Kupivla.add(l_4_logo);

			l_Greensad = new JLabel("Greensad");
			l_Greensad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://greensad.ua/ua/category/domashnie-rastenija-i-cvety/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Greensad.setHorizontalAlignment(SwingConstants.CENTER);
			l_Greensad.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Greensad.setForeground(Color.MAGENTA);
			l_Greensad.setBounds(41, 353, 193, 57);
			panel_Kupivla.add(l_Greensad);

			l_3_logo = new JLabel("");
			l_3_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://greensad.ua/ua/category/domashnie-rastenija-i-cvety/"));
					} catch (Exception e1) {
					}
				}
			});
			l_3_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_3_logo.setBounds(421, 366, 226, 57);
			l_3_logo.setIcon(new ImageIcon("res/KupivlaKartunka3.png"));
			panel_Kupivla.add(l_3_logo);

			l_Bigl = new JLabel("Bigl");
			l_Bigl.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI(
								"https://bigl.ua/Rasteniya-gorshechnye?utm_campaign=%D0%9A%D0%B0%D1%82%D0%B5%D0%B3%D0%BE%D1%80%D0%B8%D0%B8%D0%A3%D0%BA%D1%80%D0%B0%D0%B8%D0%BD%D0%B0&utm_term=&gclid=COTBvPHe5dMCFVmLsgodjskKag"));
					} catch (Exception e1) {
					}
				}
			});
			l_Bigl.setHorizontalAlignment(SwingConstants.CENTER);
			l_Bigl.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Bigl.setForeground(Color.MAGENTA);
			l_Bigl.setBounds(41, 208, 193, 57);
			panel_Kupivla.add(l_Bigl);

			l_5_logo = new JLabel("");
			l_5_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI(
								"https://bigl.ua/Rasteniya-gorshechnye?utm_campaign=%D0%9A%D0%B0%D1%82%D0%B5%D0%B3%D0%BE%D1%80%D0%B8%D0%B8%D0%A3%D0%BA%D1%80%D0%B0%D0%B8%D0%BD%D0%B0&utm_term=&gclid=COTBvPHe5dMCFVmLsgodjskKag"));
					} catch (Exception e1) {
					}
				}
			});
			l_5_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_5_logo.setBounds(421, 197, 226, 57);
			l_5_logo.setIcon(new ImageIcon("res/KupivlaKartunka5.png"));
			panel_Kupivla.add(l_5_logo);

			l_Komentar = new JLabel("Будь ласка, оберіть сервіс продажу кімнатних рослин");
			l_Komentar.setForeground(Color.WHITE);
			l_Komentar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			l_Komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_Komentar.setBounds(0, 433, 765, 26);
			panel_Kupivla.add(l_Komentar);

			l_fonKupivli = new JLabel("");
			l_fonKupivli.setBounds(0, 0, 765, 459);
			l_fonKupivli.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			panel_Kupivla.add(l_fonKupivli);
		}

		panel_Doglad = new Panel();
		tabbedPane.addTab("Догляд", null, panel_Doglad, null);

		l_fon = new JLabel("");
		l_fon.setBounds(0, 0, 794, 565);
		l_fon.setIcon(new ImageIcon("res/fon_KimnatneResultat.jpg"));
		getContentPane().add(l_fon);

		setVisible(true);

	}

}
