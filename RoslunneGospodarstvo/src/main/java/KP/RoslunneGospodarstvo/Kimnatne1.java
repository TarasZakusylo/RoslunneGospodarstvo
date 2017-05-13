package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Kimnatne1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JButton b_Dali;
	private JLabel l_fonVodaOputuvanna;

	private JLabel label_1;
	private JLabel label_4;
	private JLabel label_2;
	private JLabel label_3;
	private JCheckBox checkBox1_0;
	private JCheckBox checkBox1_1;
	private JCheckBox checkBox1_3;
	private JCheckBox checkBox1_2;
	private JCheckBox checkBox1_7;
	private JCheckBox checkBox1_6;
	private JCheckBox checkBox1_5;
	private JCheckBox checkBox1_4;
	private JCheckBox checkBox1_8;
	private JCheckBox checkBox1_9;
	private JCheckBox checkBox1_10;
	private JCheckBox checkBox1_11;
	private JCheckBox checkBox4_10;
	private JCheckBox checkBox4_9;
	private JCheckBox checkBox4_8;
	private JCheckBox checkBox4_7;
	private JCheckBox checkBox4_6;
	private JCheckBox checkBox4_5;
	private JCheckBox checkBox4_4;
	private JCheckBox checkBox4_3;
	private JCheckBox checkBox4_2;
	private JCheckBox checkBox4_1;
	private JCheckBox checkBox4_0;
	private JCheckBox checkBox2_5;
	private JCheckBox checkBox2_4;
	private JCheckBox checkBox2_3;
	private JCheckBox checkBox2_2;
	private JCheckBox checkBox2_1;
	private JCheckBox checkBox2_0;
	private JCheckBox checkBox3_5;
	private JCheckBox checkBox3_4;
	private JCheckBox checkBox3_3;
	private JCheckBox checkBox3_2;
	private JCheckBox checkBox3_1;
	private JCheckBox checkBox3_0;
	private JLabel l_komentar;

	String s_RekomendaciaText = "";
	int i_k = 0;
	String s_Kartunka1 = "res/Doglad/";
	String s_Kartunka2 = "res/Doglad/";
	String s_Kartunka3 = "res/Doglad/";
	String s_Kartunka4 = "res/Doglad/";
	String s_Kartunka5 = "res/Doglad/";

	public Kimnatne1(String s, final int i_putanna1, final int i_putanna2, final int i_putanna3,
			final int i_slider_putanna4, final int i_slider_putanna5, final int i_putanna6, final int i_putanna7,
			final int i_putanna8) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		l_Hapka = new JLabel("Виберіть рослини, що Вам до вподоби");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				i_k = 0;
				s_Kartunka1 = "";
				s_Kartunka2 = "";
				s_Kartunka3 = "";
				s_Kartunka4 = "";
				s_Kartunka5 = "";
				s_RekomendaciaText = "";

				if (checkBox1_0.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.0");
					s_RekomendaciaText = s_RekomendaciaText + "Гіацинт.\nКрасивий, нев’янучий кілька тижнів, "
							+ "квітка воліє сонячне світло, помірний полив і прохолоду. Заводячи гіацинт в "
							+ "будинку, слід пам’ятати, що він володіє сильним запахом, "
							+ "може викликати головний біль.\n\n";
				}
				if (checkBox1_1.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.1");
					s_RekomendaciaText = s_RekomendaciaText + "Крокус.\nМилі ніжні первоцвіти всіляких "
							+ "забарвлень потребують рясному поливі, додатковому освітленні, посиленому харчуванні.\n\n";
				}
				if (checkBox1_2.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.2");
					s_RekomendaciaText = s_RekomendaciaText + "Примула.\nЗа різноманітністю кольору, його насиченість "
							+ "є гідною конкуренткою навіть королеви квітів – троянди. "
							+ "Невибагливість у відході, тривалість цвітіння примули "
							+ "по достоїнству оцінені любителями кімнатного квітникарства.\n\n";
				}
				if (checkBox1_3.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.3");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Хризантеми.\nЧудово себе почувають в умовах квартири осінні хризантеми."
							+ " Сьогодні виведено велику кількість низькорослих сортів. Це невеликий, "
							+ "компактний кущик, який органічно впишеться в будь-підвіконня."
							+ " Величезна колірна гамма, невимогливість у догляді швидко знайшли "
							+ "своїх шанувальників серед любителів кімнатного садівництва. "
							+ "Ці хризантеми універсальні – у літній період їх можна виставляти на "
							+ "балкон або терасу. А деякі секрети садівників дозволять змусити цвісти"
							+ " хризантеми з середини літа.\n\n";
				}
				if (checkBox1_4.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.4");
					s_RekomendaciaText = s_RekomendaciaText + "Антуріум.\nАнтуріум належить до "
							+ "найпопулярніших представників родини. Вирощують не лише кімнатний "
							+ "антуріум, а й садовий, а також спеціально на зріз. У культурі "
							+ "вирощують понад 100 гібридів, які висаджують у садах, квартирах"
							+ " або використовують при складанні букетів. Домашній антуріум "
							+ "вирощують як заради красивого листя, так і задля квітів.\n\n";
				}
				if (checkBox1_5.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.5");
					s_RekomendaciaText = s_RekomendaciaText + "Гіппеаструм.\nРослина гіпеаструм "
							+ "(лат. Hippeastrum) належить до родини Амарилісові. Налічується "
							+ "близько 90 видів гіпеаструма. Назва квітки складається з двох "
							+ "коренів давньогрецької мови, що означають у перекладі «вершник»"
							+ " і «зірка». Нерідко гіпеаструм плутають з амарилісом, але слід "
							+ "знати, що амариліс прекрасний (єдиний представник роду) росте "
							+ "в природі на півдні Африки, а гіпеаструм – у тропіках і "
							+ "субтропіках Америки, зокрема в басейні Амазонки. Амариліс "
							+ "і гіпеаструм – родичі, що належать до однієї ботанічної "
							+ "родини, але представляють різні роди. Завезли гіпеаструм "
							+ "до Європи в XVI столітті, а в 1799 році з'явився перший "
							+ "гібрид рослини – гіпеаструм Джонсона.\n\n";
				}
				if (checkBox1_6.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.6");
					s_RekomendaciaText = s_RekomendaciaText + "Сенполія (фіалка).\nСенполія, узамбарська"
							+ " фіалка (Saintpaulia) — рід трав'янистих рослин із тропічних районів"
							+ " центральної і західної Африки з оксамитовими зеленими листками і "
							+ "фіолетовими квітами без запаху. На основі виду Saintpaulia ionantha"
							+ " штучно виведені махрові сорти і сорти з різним забарвленням квітів.\n\n";
				}
				if (checkBox1_7.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.7");
					s_RekomendaciaText = s_RekomendaciaText + "Кімнатна Герань (пеларгонія).\nСпокійно "
							+ "ставиться до прямих сонячних променів. Але не варто піддавати постійному "
							+ "їх впливу. При недоліку світла пеларгонія втрачає листя, негарно заголяя "
							+ "стебло. Належить до лікарських рослин.\n\n";
				}
				if (checkBox1_8.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.8");
					s_RekomendaciaText = s_RekomendaciaText + "Орхідея.\nОрхідеї досить вимогливі до "
							+ "температурного режиму і поливу. Досвідчені рослинники рекомендують "
							+ "починати з сортів простіше. Але якщо перший квітка прижився в будинку,"
							+ " мікроклімат ідеально підходить не тільки для його зростання, але і"
							+ " цвітіння, то гарантована відданість йому на все життя.\n\n";
				}
				if (checkBox1_9.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.9");
					s_RekomendaciaText = s_RekomendaciaText + "Клівія.\nВіддає перевагу розсіяному"
							+ " сонячному світлу. Страждає від надлишку її, так і від недоліку. "
							+ "В іншому досить не вимоглива рослина, непогано переносить недолік"
							+ " вологи в грунті та повітрі.\n\n";
				}
				if (checkBox1_10.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.10");
					s_RekomendaciaText = s_RekomendaciaText + "Бальзамін.\nБальзамін (Impatiens) "
							+ "- багаторічна і однорічна рослина, що належить до родини "
							+ "бальзамінових. У природному середовищі бальзамін можна "
							+ "зустріти в тропічних та субтропічних лісах Азії та Африки."
							+ " Бальзаміни - рослини невибагливі, за ними легко доглядати,"
							+ " вони швидко ростуть, рясно і довго цвітуть, легко розмножуються.\n\n";
				}
				if (checkBox1_11.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "1.11");
					s_RekomendaciaText = s_RekomendaciaText + "Азалія.\nДосить примхлива, "
							+ "вимоглива рослина, але при належному догляді радує щедрим"
							+ " цвітінням тривалий час. Погано переносить прямі сонячні "
							+ "промені, що комфортно відчуває себе в півтіні. На літній "
							+ "період бажано виносити на свіже повітря, захищаючи від протягів."
							+ " Податливі стебла дозволяють формувати з азалії бонсай, що "
							+ "успішно практикується на її батьківщині – в країнах "
							+ "Південно-Східної Азії, Китаї, Японії.\n\n";
				}

				if (checkBox2_0.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.0");
					s_RekomendaciaText = s_RekomendaciaText + "Алое.\nКімнатна рослина, "
							+ "що володіє рядом цілющих властивостей. Листя і сік алое "
							+ "використовуються в народній медицині, дерматології, "
							+ "косметології, при простудних захворюваннях. Рослина "
							+ "не вимоглива, швидко зростає.\n\n";
				}
				if (checkBox2_1.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.1");
					s_RekomendaciaText = s_RekomendaciaText + "Товстянка.\nТовстянка"
							+ " прийшла до нас з Південної Африки і Мадагаскару."
							+ " Деякі види в природі досягають кілька метрів у висоту. "
							+ "Листя толстянки містять миш’як, тому її вирощування в "
							+ "будинку, де є тварини, що можуть поласувати соковитими"
							+ " листочками, вкрай небажано.\n\n";
				}
				if (checkBox2_2.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.2");
					s_RekomendaciaText = s_RekomendaciaText + "Каланхое.\nНе дарма"
							+ " кімнатна каланхое називають домашнім лікарем. Рослина"
							+ " відноситься до групи біогенних стимуляторів. Його "
							+ "м’ясисті листя і сік мають ранозагоювальні, кровоспинними,"
							+ " бактерицидними властивостями. У догляді каланхое " + "вкрай невибагливо.\n\n";
				}
				if (checkBox2_3.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.3");
					s_RekomendaciaText = s_RekomendaciaText + "Кактуси.\nЗа кількістю видів "
							+ "та сортів кактуси можуть посперечатися з декоративно-квітучими"
							+ " рослинами. Зазвичай кактусознавці не тримають у себе ніяких "
							+ "інших кольорів, віддавши своє серце цим колючим прибульцям з"
							+ " тропічних країн. Залежно від середовища зростання кактуси "
							+ "діляться на степові, лісові і пустельні. Догляд за ними "
							+ "повинен враховувати природне середовище зростання, щоб"
							+ " рослина не тільки відчувало себе комфортно, але порадувало"
							+ " квітами, які в більшості сортів дуже красиві і незвичайні.\n\n";
				}
				if (checkBox2_4.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.4");
					s_RekomendaciaText = s_RekomendaciaText + "Сансевієрія.\nВ народі давно "
							+ "це невибаглива рослина називають тещин язик. Може тому, що "
							+ "листя його досягають декількох десятків сантиметрів, а може "
							+ "завдяки невгамовній спразі до життя, яку неможливо викорінити"
							+ " ні зниженою вологістю, ні рідкісними поливами, ні"
							+ " затененностью. Сансевієрія є лікарською рослиною завдяки "
							+ "вмісту великої кількості сапонінів, які мають жовчогінну, "
							+ "проносну, відхаркувальну, протизапальну дію. А ще відомо, "
							+ "що «тещин язик» є потужним очищувач повітря, рекомендована"
							+ " для приміщень з великою кількістю людей.\n\n";
				}
				if (checkBox2_5.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "2.5");
					s_RekomendaciaText = s_RekomendaciaText + "Молочай.\nРослина містить понад"
							+ " 2000 видів, багато з яких не підходять для вирощування в "
							+ "квартирних умовах завдяки високому зростанню. Стійкі до сухого"
							+ " повітря, молочаї віддають перевагу яскравому світлу. Для гарного"
							+ " росту, формування красивих листя молочаю крім великої кількості"
							+ " світла необхідні помірний полив і прохолода взимку.\n\n";
				}

				if (checkBox3_0.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.0");
					s_RekomendaciaText = s_RekomendaciaText + "Цитрусові.\nКімнатний лимон – "
							+ "вічнозелене дерево, яке цвіте і плодоносить кілька разів на рік."
							+ " Плоди мають сильний аромат, більш тонку шкірку, ніж ті, які "
							+ "вирощені у відкритому ґрунті. Вирощувати ці рослини можна двома "
							+ "способами: з кісточки або черешка. В першому варіанті у вас вийде"
							+ " більш сильне дерево, що має красиву крону і стійкий до "
							+ "захворювань. Правда, будьте готові до того, що отриманий "
							+ "таким чином лимон буде трохи відрізнятися від того плоду "
							+ "звідки були взяті кісточки. Якщо ж ви хочете отримати, швидше,"
							+ " красиве і плодоносить деревце, то краще придбати вже щеплений,"
							+ " сильний держак.\n Лимони люблять сонячне світло, але пам’ятайте,"
							+ " якщо влітку протягом тривалого часу рослина перебувати під прямими"
							+ " сонячними променями, деревце краще буде прикрити або переставити "
							+ "в більш затемнене місце. Також важливо стежити за температурою "
							+ "вихідної від батарей взимку, лимон не любить коли дуже спекотно."
							+ " Тому джерела опалення краще буде прикрити або переставити "
							+ "рослину в прохолодне місце.\nДля підтримки вологості лимон "
							+ "потрібно регулярно обприскувати. Також можна поставити горщик "
							+ "з деревцем у піддон із водою. Поливають його кип’яченою або "
							+ "добре відстояною водою. У середньому полив здійснюють — влітку"
							+ " двічі на тиждень, взимку один раз.\nМАНДАРИН та АПЕЛЬСИН\nЦі "
							+ "цитрусові дерева дуже схожі між собою по умовам догляду та "
							+ "вирощування. Їх можна вирощувати як з кісточки, так і купивши"
							+ " вже підріс держак. Кісточку для посадки краще не пересушувати,"
							+ " відразу вийнявши її з плоду посадити в землю.Звичайна магазинна"
							+ " грунт для кімнатних рослин їм не підходить.Рослина, що виросло"
							+ " з кісточки і не щеплена, не може плодоносити зовсім або дуже "
							+ "рідко, а також зовсім не цвісти. Якщо вас це не турбує, то "
							+ "залишаємо все як є, хочете плодів – деревце потрібно обов’язково"
							+ " прищепити. Купівля щепленого, підрослого черешка плодового "
							+ "рослини зніме ці клопоти. Також будьте готові до того, що "
							+ "отримані плоди можуть істотно відрізнятися за розміром, смаком"
							+ " від тих, які ми звикли бачити на прилавках магазинів.\nДерева "
							+ "цитрусових люблять сонячне світло, але від палючих променів їх "
							+ "треба ховати. Для поливу вода повинна бути кімнатної температури,"
							+ " добре відстояною. Намагайтеся обприскувати їх раз на тиждень."
							+ " Буде дуже корисно поставити горщик з цитрусовим деревцем у " + "піддон із водою.\n\n";
				}
				if (checkBox3_1.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.1");
					s_RekomendaciaText = s_RekomendaciaText + "Гранат.\nТак як в природі"
							+ " це дерево росте на кам’янистих сухих схилах, вирощування "
							+ "його вдома не викликає особливих складнощів. Це кімнатна "
							+ "плодова рослина буде добре почувати себе на таких сумішах, як:\n"
							+ "-50%, – дернова земля, 25% – листовий перегній, 12% – торф, 13% – пісок;\n"
							+ "-пісок – 50%, суглинок – 25%, торф – 25%;\n"
							+ "-2 частини землі, глинисто-дернової і з рівних частин листової землі, перегною, піску;\n"
							+ "-молодим рослинам підійде грунт, що складається з рівних частин дернової "
							+ "ґрунту, перегною, листової землі, піску.\n\n";
				}
				if (checkBox3_2.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.2");
					s_RekomendaciaText = s_RekomendaciaText + "Кавове дерево.\nЩоб виростити "
							+ "кавове дерево, яке буде давати плоди треба затратити чимало часу"
							+ " і багато зусиль. В сприятливих для кавової рослини умовах, вона"
							+ " дає плоди. Щоправда плодів недуже багато, за рік одне кавове "
							+ "дерево дасть 500 грам зернин кави, з яких можна зварити справжню"
							+ " запашну каву, а з шкарлупок на батьківщині кави варять аромантий"
							+ " кавовий чай. \nКавове дерево - рослина досить невибаглива, воно"
							+ " не вимагає особливого догляду. Рослина в кімнатних умовах "
							+ "виростає у висоту до двох метрів. Однак дуже важко виростити"
							+ " його з маленького живця або насіння.\n\n";
				}
				if (checkBox3_3.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.3");
					s_RekomendaciaText = s_RekomendaciaText + "Авокадо.\nАвокадо або "
							+ "алігаторова груша (Persea americana) — дерево родини "
							+ "лаврових. Походить із Центральної Америки. Вирощується"
							+ " в зоні тропіків. Плоди їстівні, смачні, грушоподібні "
							+ "ягоди, з кісточкою всередині. М'якуш багатий на жири."
							+ " Часто мажуть на хліб або роблять мексиканську страву"
							+ " Гуакамоле (суміш перетертого авокадо, помідорів, перцю),"
							+ " котру використовують як пасту на хліб або для вмочування."
							+ " Народи Східної Азії споживають як десерт або як фрукти.\n\n";
				}
				if (checkBox3_4.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.4");
					s_RekomendaciaText = s_RekomendaciaText + "Ананас.\nЦей екзотичний "
							+ "гість порадує не тільки апетитними плодами, але і дуже "
							+ "оригінальною зовнішністю. Він красиво цвіте, через кілька"
							+ " років, при гарному догляді, може дати їстівний плід. Так"
							+ " само як і інші плодоносні кімнатні рослини можна виростити"
							+ " самим з частини ананаса, або купити вже укоріненої держак.\n"
							+ "Для того щоб самим виростити ананас потрібно зрізати верхівку"
							+ " плоду, посадити її в суміш торфу і піску, накривши все"
							+ " поліетиленовим пакетом або банкою, для збереження вологості."
							+ " Як тільки з’являться корені, можна пересаджувати в грунт,"
							+ " що складається з листового перегною, піску й дернової землі."
							+ " Висаджується підріс кущик в великий, неглибокий горщик."
							+ " Ананас любить простір і тільки тоді приносить плоди.\n\n";
				}
				if (checkBox3_5.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "3.5");
					s_RekomendaciaText = s_RekomendaciaText + "Інжир.\nЦе невибаглива, "
							+ "кімнатне плодову рослину, одне з небагатьох, яке гарантовано"
							+ " порадує вас смачними плодами. На жаль, воно не буде стояти"
							+ " цілий рік з зеленим листям, як цитрусові дерева. На зиму"
							+ " інжир скидає листя і засинає. Саме тому найкращим місцем"
							+ " для вирощування його буде засклений балкон або лоджія."
							+ " Влітку там досить тепло і багато сонця, а взимку прохолодно.\n"
							+ "Вирощувати інжир можна використовуючи держак або кісточку. "
							+ "Однак пам’ятайте, що рослина, вирощена з черешка, почне"
							+ " плодоносити набагато швидше, ніж те, яке виростили з "
							+ "насінини. Також для активного плодоношення інжиру потрібно"
							+ " багато світла, тому розміщувати його треба на південній "
							+ "стороні. До грунту немає особливих вимог. Якісний покупної"
							+ " субстрат з невеликим додаванням дернової землі і піску "
							+ "буде ідеальним грунтом.\n\n";
				}

				if (checkBox4_0.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.0");
					s_RekomendaciaText = s_RekomendaciaText + "Традесканція.\nНевибаглива,"
							+ " легко розмножується квітка прийшов до нас з тропічних лісів Американського континенту. Ліани традесканції швидко ростуть, їх використовують для оформлення стін, віконних прорізів. У зимових садах, оранжереях, вони швидко покривають всю поверхню землі гарним килимом з яскравих блискучих листя.\n\n";
				}
				if (checkBox4_1.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.1");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Пуансетія.\nЗавдяки своїм дивовижним прицветникам, що нагадує зірки, цвітіння в переддень різдва пуансетія отримала назву «Різдвяна зірка». Щоб рослина зацвіла саме до свята, необхідно дотримуватися кількох нескладних правил догляду за ним, регулюючи тривалість освітлення і полив.\n\n";
				}
				if (checkBox4_2.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.2");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Кротон.\nЕфектна рослина належить до виду молочайних, виділяють білий сік при пошкодженні. У кімнатних умовах виростає не вище метра, хоча в природі досягає трьох метрів. Красивий колір листя змінюється з віком. Любить хороше освітлення і теплі приміщення.\n\n";
				}
				if (checkBox4_3.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.3");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Бегонія Бауера (тигрова).\nРізновид бегонії, квіти якої не мають ніякої декоративності. В період цвітіння квітконоси видаляються, щоб не забирали життєві соки у красивих листя. Легко розмножується, швидко росте, потребує регулярної пересадки. Для кращого росту надземної частини бажано, щоб коріння було трохи затісно в горщику.\n\n";
				}
				if (checkBox4_4.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.4");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Папоротеві.\nКімнатні папороті вирощуються не тільки завдяки гарною ажурною листі, але і їх невибагливості, спокійному відношенню до півтіні. Часто їх листя використовуються для оформлення букетів. Найбільш популярні папоротеві: венерин волосся, оленячий ріг, аспленіум, орляк, дуже схожий на ростуть у наших лісах папороті, і нефролепис.\n\n";
				}
				if (checkBox4_5.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.5");
					s_RekomendaciaText = s_RekomendaciaText + "Агава.\nВ кімнатній культурі можна вирощувати невеликі"
							+ " за розмірами види, які можуть бути не просто декоративними, а й використовуватися як"
							+ " технічні або лікарські рослини.\nАгави — світолюбні рослини. Взимку їх"
							+ " утриимують за температури 10-12 °C, полив обмежують. Улітку полив має "
							+ "бути регулярним. Висаджують у поживну, листяно-дернову землесуміш з "
							+ "додаванням великозернистого піску та гравію.\n\n";
				}
				if (checkBox4_6.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.6");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Диффенбахія.\nКрасиве рослина з потужними стеблами і великими плямистими листям, виростає у висоту до метра. Дуже невимоглива. Може рости в тіні, але тоді строкатість листя пропадає.\n\n";
				}
				if (checkBox4_7.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.7");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Драцена.\nНескладний догляд за цією рослиною полягає в наданні достатнього освітлення і рясному поливі. Легка в розмноженні драцена відмінно уживається в будь-яких, навіть самих маленьких приміщеннях.\n\n";
				}
				if (checkBox4_8.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.8");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Юкка.\nНевибаглива у догляді рослина може обійтися убогою грунтом і поливом, але дуже любить сонячне світло. Значно прискорити зростання юки можна з допомогою мінеральних підживлень.\n\n";
				}
				if (checkBox4_9.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.9");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Монстера.\nРослина з гарними листям, товстим стеблом виростає до чотирьох метрів. Невимоглива, нормально переносить знижену вологість, недостатній полив. Виділяється листям монстери речовина здатна знімати головний біль.\n\n";
				}
				if (checkBox4_10.isSelected() == true) {
					i_k++;
					Rekomendacia(i_k, "4.10");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Фікус.\nМає кілька видів, які відрізняються формою і кольором листків, висотою дорослої рослини. Невимогливий. Деревоподібні види часто використовуються в мистецтві бонсай (фікус Бенджаміна).\n\n";
				}

				if (i_k == 0) {
					JOptionPane.showMessageDialog(null,
							"Ви не вибрали жодного параметра. Системою вибрані рекомендовані рараметри.");
					i_k++;
					Rekomendacia(i_k, "1.8");
					s_RekomendaciaText = s_RekomendaciaText + "Орхідея.\nОрхідеї досить вимогливі до "
							+ "температурного режиму і поливу. Досвідчені рослинники рекомендують "
							+ "починати з сортів простіше. Але якщо перший квітка прижився в будинку,"
							+ " мікроклімат ідеально підходить не тільки для його зростання, але і"
							+ " цвітіння, то гарантована відданість йому на все життя.\n\n";
					i_k++;
					Rekomendacia(i_k, "2.3");
					s_RekomendaciaText = s_RekomendaciaText + "Кактуси.\nЗа кількістю видів "
							+ "та сортів кактуси можуть посперечатися з декоративно-квітучими"
							+ " рослинами. Зазвичай кактусознавці не тримають у себе ніяких "
							+ "інших кольорів, віддавши своє серце цим колючим прибульцям з"
							+ " тропічних країн. Залежно від середовища зростання кактуси "
							+ "діляться на степові, лісові і пустельні. Догляд за ними "
							+ "повинен враховувати природне середовище зростання, щоб"
							+ " рослина не тільки відчувало себе комфортно, але порадувало"
							+ " квітами, які в більшості сортів дуже красиві і незвичайні.\n\n";
					i_k++;
					Rekomendacia(i_k, "2.4");
					s_RekomendaciaText = s_RekomendaciaText + "Сансевієрія.\nВ народі давно "
							+ "це невибаглива рослина називають тещин язик. Може тому, що "
							+ "листя його досягають декількох десятків сантиметрів, а може "
							+ "завдяки невгамовній спразі до життя, яку неможливо викорінити"
							+ " ні зниженою вологістю, ні рідкісними поливами, ні"
							+ " затененностью. Сансевієрія є лікарською рослиною завдяки "
							+ "вмісту великої кількості сапонінів, які мають жовчогінну, "
							+ "проносну, відхаркувальну, протизапальну дію. А ще відомо, "
							+ "що «тещин язик» є потужним очищувач повітря, рекомендована"
							+ " для приміщень з великою кількістю людей.\n\n";
					i_k++;
					Rekomendacia(i_k, "3.5");
					s_RekomendaciaText = s_RekomendaciaText + "Інжир.\nЦе невибаглива, "
							+ "кімнатне плодову рослину, одне з небагатьох, яке гарантовано"
							+ " порадує вас смачними плодами. На жаль, воно не буде стояти"
							+ " цілий рік з зеленим листям, як цитрусові дерева. На зиму"
							+ " інжир скидає листя і засинає. Саме тому найкращим місцем"
							+ " для вирощування його буде засклений балкон або лоджія."
							+ " Влітку там досить тепло і багато сонця, а взимку прохолодно.\n"
							+ "Вирощувати інжир можна використовуючи держак або кісточку. "
							+ "Однак пам’ятайте, що рослина, вирощена з черешка, почне"
							+ " плодоносити набагато швидше, ніж те, яке виростили з "
							+ "насінини. Також для активного плодоношення інжиру потрібно"
							+ " багато світла, тому розміщувати його треба на південній "
							+ "стороні. До грунту немає особливих вимог. Якісний покупної"
							+ " субстрат з невеликим додаванням дернової землі і піску "
							+ "буде ідеальним грунтом.\n\n";
					i_k++;
					Rekomendacia(i_k, "4.7");
					s_RekomendaciaText = s_RekomendaciaText
							+ "Драцена.\nНескладний догляд за цією рослиною полягає в наданні достатнього освітлення і рясному поливі. Легка в розмноженні драцена відмінно уживається в будь-яких, навіть самих маленьких приміщеннях.\n\n";

				}

				if (i_k > 5) {
					JOptionPane.showMessageDialog(null, "Ви вибрали " + i_k + " видів. Будь ласка, скоротіть до 5.");
				} else {
					new KimnatneResultatu("Кімнатне рослинництво. Результат", i_putanna1, i_putanna2, i_putanna3,
							i_slider_putanna4, i_slider_putanna5, i_putanna6, i_putanna7, i_putanna8, s_Kartunka1,
							s_Kartunka2, s_Kartunka3, s_Kartunka4, s_Kartunka5, s_RekomendaciaText);
					setVisible(false);
				}

				// System.out.println(s_Kartunka1);
				// System.out.println(s_Kartunka2);
				// System.out.println(s_Kartunka3);
				// System.out.println(s_Kartunka4);
				// System.out.println(s_Kartunka5);
				// System.out.println();
				// System.out.println(s_RekomendaciaText);
				// System.out.println();
			}
		});
		b_Dali.setBounds(90, 523, 610, 41);
		getContentPane().add(b_Dali);

		label_1 = new JLabel("Декоративно-квітучі");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(-6, 47, 200, 30);
		getContentPane().add(label_1);

		label_4 = new JLabel("Декоративно-листяні");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_4.setBounds(594, 47, 200, 30);
		getContentPane().add(label_4);

		label_2 = new JLabel("Сукуленти :");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(194, 47, 200, 30);
		getContentPane().add(label_2);

		label_3 = new JLabel("Плодові :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_3.setBounds(386, 47, 200, 30);
		getContentPane().add(label_3);

		checkBox1_0 = new JCheckBox("Гіацинт");
		checkBox1_0.setOpaque(false);
		checkBox1_0.setBounds(0, 96, 160, 25);
		getContentPane().add(checkBox1_0);

		checkBox1_1 = new JCheckBox("Крокус");
		checkBox1_1.setOpaque(false);
		checkBox1_1.setBounds(0, 134, 160, 25);
		getContentPane().add(checkBox1_1);

		checkBox1_3 = new JCheckBox("Хризантеми");
		checkBox1_3.setOpaque(false);
		checkBox1_3.setBounds(0, 204, 160, 25);
		getContentPane().add(checkBox1_3);

		checkBox1_2 = new JCheckBox("Примула");
		checkBox1_2.setOpaque(false);
		checkBox1_2.setBounds(0, 169, 160, 25);
		getContentPane().add(checkBox1_2);

		checkBox1_7 = new JCheckBox("Герань");
		checkBox1_7.setOpaque(false);
		checkBox1_7.setBounds(0, 344, 160, 25);
		getContentPane().add(checkBox1_7);

		checkBox1_6 = new JCheckBox("Сенполія (фіалка)");
		checkBox1_6.setOpaque(false);
		checkBox1_6.setBounds(0, 308, 160, 25);
		getContentPane().add(checkBox1_6);

		checkBox1_5 = new JCheckBox("Гіппеаструм");
		checkBox1_5.setOpaque(false);
		checkBox1_5.setBounds(0, 274, 160, 25);
		getContentPane().add(checkBox1_5);

		checkBox1_4 = new JCheckBox("Антуріум");
		checkBox1_4.setOpaque(false);
		checkBox1_4.setBounds(0, 238, 160, 25);
		getContentPane().add(checkBox1_4);

		checkBox1_8 = new JCheckBox("Орхідея");
		checkBox1_8.setOpaque(false);
		checkBox1_8.setBounds(0, 380, 160, 25);
		getContentPane().add(checkBox1_8);

		checkBox1_9 = new JCheckBox("Клівія");
		checkBox1_9.setOpaque(false);
		checkBox1_9.setBounds(0, 417, 160, 25);
		getContentPane().add(checkBox1_9);

		checkBox1_10 = new JCheckBox("Бальзамін");
		checkBox1_10.setOpaque(false);
		checkBox1_10.setBounds(0, 450, 160, 25);
		getContentPane().add(checkBox1_10);

		checkBox1_11 = new JCheckBox("Азалія");
		checkBox1_11.setOpaque(false);
		checkBox1_11.setBounds(0, 486, 160, 25);
		getContentPane().add(checkBox1_11);

		checkBox4_10 = new JCheckBox("Фікус");
		checkBox4_10.setOpaque(false);
		checkBox4_10.setBounds(626, 450, 160, 25);
		getContentPane().add(checkBox4_10);

		checkBox4_9 = new JCheckBox("Монстера");
		checkBox4_9.setOpaque(false);
		checkBox4_9.setBounds(626, 417, 160, 25);
		getContentPane().add(checkBox4_9);

		checkBox4_8 = new JCheckBox("Юкка");
		checkBox4_8.setOpaque(false);
		checkBox4_8.setBounds(626, 380, 160, 25);
		getContentPane().add(checkBox4_8);

		checkBox4_7 = new JCheckBox("Драцена");
		checkBox4_7.setOpaque(false);
		checkBox4_7.setBounds(626, 344, 160, 25);
		getContentPane().add(checkBox4_7);

		checkBox4_6 = new JCheckBox("Диффенбахія");
		checkBox4_6.setOpaque(false);
		checkBox4_6.setBounds(626, 308, 160, 25);
		getContentPane().add(checkBox4_6);

		checkBox4_5 = new JCheckBox("Агава");
		checkBox4_5.setOpaque(false);
		checkBox4_5.setBounds(626, 274, 160, 25);
		getContentPane().add(checkBox4_5);

		checkBox4_4 = new JCheckBox("Папоротеві");
		checkBox4_4.setOpaque(false);
		checkBox4_4.setBounds(626, 238, 160, 25);
		getContentPane().add(checkBox4_4);

		checkBox4_3 = new JCheckBox("Бегонія Бауера");
		checkBox4_3.setOpaque(false);
		checkBox4_3.setBounds(626, 204, 160, 25);
		getContentPane().add(checkBox4_3);

		checkBox4_2 = new JCheckBox("Кротон");
		checkBox4_2.setOpaque(false);
		checkBox4_2.setBounds(626, 169, 160, 25);
		getContentPane().add(checkBox4_2);

		checkBox4_1 = new JCheckBox("Пуансетія");
		checkBox4_1.setOpaque(false);
		checkBox4_1.setBounds(626, 134, 160, 25);
		getContentPane().add(checkBox4_1);

		checkBox4_0 = new JCheckBox("Традесканція");
		checkBox4_0.setOpaque(false);
		checkBox4_0.setBounds(626, 96, 160, 25);
		getContentPane().add(checkBox4_0);

		checkBox2_5 = new JCheckBox("Молочай");
		checkBox2_5.setOpaque(false);
		checkBox2_5.setBounds(218, 274, 160, 25);
		getContentPane().add(checkBox2_5);

		checkBox2_4 = new JCheckBox("Сансевієрія");
		checkBox2_4.setOpaque(false);
		checkBox2_4.setBounds(218, 238, 160, 25);
		getContentPane().add(checkBox2_4);

		checkBox2_3 = new JCheckBox("Кактуси");
		checkBox2_3.setOpaque(false);
		checkBox2_3.setBounds(218, 204, 160, 25);
		getContentPane().add(checkBox2_3);

		checkBox2_2 = new JCheckBox("Каланхое");
		checkBox2_2.setOpaque(false);
		checkBox2_2.setBounds(218, 169, 160, 25);
		getContentPane().add(checkBox2_2);

		checkBox2_1 = new JCheckBox("Товстянка");
		checkBox2_1.setOpaque(false);
		checkBox2_1.setBounds(218, 134, 160, 25);
		getContentPane().add(checkBox2_1);

		checkBox2_0 = new JCheckBox("Алое");
		checkBox2_0.setOpaque(false);
		checkBox2_0.setBounds(218, 96, 160, 25);
		getContentPane().add(checkBox2_0);

		checkBox3_5 = new JCheckBox("Інжир");
		checkBox3_5.setOpaque(false);
		checkBox3_5.setBounds(410, 274, 160, 25);
		getContentPane().add(checkBox3_5);

		checkBox3_4 = new JCheckBox("Ананас");
		checkBox3_4.setOpaque(false);
		checkBox3_4.setBounds(410, 238, 160, 25);
		getContentPane().add(checkBox3_4);

		checkBox3_3 = new JCheckBox("Авокадо");
		checkBox3_3.setOpaque(false);
		checkBox3_3.setBounds(410, 204, 160, 25);
		getContentPane().add(checkBox3_3);

		checkBox3_2 = new JCheckBox("Кавове дерево");
		checkBox3_2.setOpaque(false);
		checkBox3_2.setBounds(410, 169, 160, 25);
		getContentPane().add(checkBox3_2);

		checkBox3_1 = new JCheckBox("Гранат");
		checkBox3_1.setOpaque(false);
		checkBox3_1.setBounds(410, 134, 160, 25);
		getContentPane().add(checkBox3_1);

		checkBox3_0 = new JCheckBox("Цитрусові");
		checkBox3_0.setOpaque(false);
		checkBox3_0.setBounds(410, 96, 160, 25);
		getContentPane().add(checkBox3_0);

		l_komentar = new JLabel("До п'яти видів");
		l_komentar.setForeground(Color.WHITE);
		l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(206, 28, 351, 25);
		getContentPane().add(l_komentar);

		l_fonVodaOputuvanna = new JLabel("");
		l_fonVodaOputuvanna.setBounds(0, -1, 794, 565);
		l_fonVodaOputuvanna.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\artleo.com-51610.jpg"));
		getContentPane().add(l_fonVodaOputuvanna);

		setVisible(true);
	}

	protected void Rekomendacia(int i_k, String string) {

		switch (i_k) {
		case 1: {
			s_Kartunka1 = "res/Doglad/" + string + ".jpg";
		}
			break;
		case 2: {
			s_Kartunka2 = "res/Doglad/" + string + ".jpg";
		}
			break;
		case 3: {
			s_Kartunka3 = "res/Doglad/" + string + ".jpg";
		}
			break;
		case 4: {
			s_Kartunka4 = "res/Doglad/" + string + ".jpg";
		}
			break;
		case 5: {
			s_Kartunka5 = "res/Doglad/" + string + ".jpg";
		}
			break;
		// default: {
		// JOptionPane.showMessageDialog(null, "Ви вибрали занадто багато видів.
		// Будь ласка, скоротіть до 5.");
		// }
		// break;
		}

	}
}
