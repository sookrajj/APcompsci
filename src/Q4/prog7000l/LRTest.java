package Q4.prog7000l;

public class LRTest {
    public static void main(String[] args) {
        double[][] X_train = {
                {2.49, 1},
                {2.57, 1},
                {3.41, 1},
                {1.25, 1},
                {1.62, 1},
                {3.83, 1},
                {11.64, 1},
                {6.41, 1},
                {8.32, 1}
        };
        double[] Y_train = {147.1, 130.1, 129.9, 113.5, 137.5, 162.3, 207.5, 177.9, 210.3};
        var lr = new LinearRegression(5, 100, .01, .001);
        lr.fit(X_train, Y_train, 1000);
        System.out.println(lr);

        double input = 6.75;
        System.out.println("Predicted output for " + input + ": " + lr.predict(input));
        System.out.println("Compared to " + X_train[7][0] + ": " + Y_train[7]);
        System.out.println("Compared to " + X_train[8][0] + ": " + Y_train[8]);
    }
}
//Regression line: y = 9.308558719368973 * x + 114.21236094085782
//Objective: [4719.690000000002, 2640.637234695032, 1580.4138452525322, 1020.1168473699358, 712.34795090253, 536.6086768807965, 432.58660224183046, 369.0822351489952, 329.3421781680944, 304.00972228943846, 287.6552355054554, 277.01701728682843, 270.0776282584965, 265.55987453847996, 262.64077629946536, 260.78311602065713, 259.6329528860191, 258.95557917830155, 258.59465462693976, 258.4457198708155, 258.43883413568597, 258.5271023918415, 258.67905178730797, 258.87354637674883, 259.0963860982743, 259.338028116284, 259.59205829867966, 259.85416504991025, 260.12145002113454, 260.39196493481234, 260.66440027240213, 260.93787599863674, 261.2118008630663, 261.48577779992166, 261.75954031958275, 262.03290973723716, 262.30576641217846, 262.57803040800246, 262.8496484876681, 263.1205853683624, 263.39081784082526, 263.66033081488655, 263.92911466027425, 264.19716341843315, 264.46447360005027, 264.7310433764416, 264.99687203579276, 265.2619596174907, 265.5263066662307, 265.78991406664244, 266.05278293208255, 266.3149145298356, 266.5763102308074, 266.8369714756827, 267.0968997521582, 267.3560965796171, 267.6145634988158, 267.8723020649357, 268.12931384289897, 268.38560040420435, 268.64116332479557, 268.8960041836073, 269.1501245615834, 269.4035260409972, 269.65621020499697, 269.90817863727347, 270.1594329218366, 270.4099746428497, 270.65980538450816, 270.90892673094766, 271.1573402661728, 271.40504757399924, 271.65205023799723, 271.89834984145716, 272.1439479673408, 272.38884619825194, 272.63304611640154, 272.87654930356797, 273.11935734107266, 273.3614718097472, 273.6028942899005, 273.8436263612928, 274.0836696031031, 274.32302559390394, 274.5616959116291, 274.79968213354886, 275.0369858362366, 275.2736085955524, 275.5095519866028, 275.7448175837215, 275.97940696044503, 276.2133216894779, 276.4465633426729, 276.6791334910047, 276.911033704543, 277.14226555242635, 277.3728306028413, 277.6027304229943, 277.83196657908667, 278.060540636295, 278.28845415874025, 278.51570870947205, 278.74230585043745, 278.96824714246435, 279.1935341452377, 279.41816841727064, 279.64215151589036, 279.86548499721033, 280.0881704161128, 280.3102093262227, 280.53160327989093, 280.7523538281668, 280.97246252078395, 281.1919309061374, 281.4107605312602, 281.6289529418054, 281.84650968203084, 282.0634322947698, 282.27972232141815, 282.49538130191377, 282.7104107747137, 282.924812276784, 283.1385873435727, 283.3517375089954, 283.5642643054156, 283.77616926362487, 283.9874539128327, 284.19811978063876, 284.40816839302283, 284.61760127432484, 284.82641994722746, 285.0346259327415, 285.2422207501864, 285.4492059171777, 285.6555829496058, 285.86135336162647, 286.0665186656391, 286.27108037227134, 286.4750399903741, 286.67839902698773, 286.8811589873448, 287.08332137484666, 287.28488769104956, 287.48585943564746, 287.68623810646824, 287.8860251994473, 288.0852222086206, 288.28383062610857, 288.4818519421034, 288.6792876448567, 288.87613922066345, 289.0724081538529, 289.2680959267713, 289.4632040197729, 289.65773391120365, 289.8516870773953, 290.0450649926458, 290.23786912921184, 290.43010095729676, 290.62176194503365, 290.81285355848536, 291.0033772616186, 291.19333451630416, 291.3827267823004, 291.571555517244, 291.759822176638, 291.947528213845, 292.1346750800696, 292.321264224354, 292.507297093568, 292.6927751323959, 292.8776997833243, 293.0620724866439, 293.2458946804232, 293.4291678005155, 293.61189328053604, 293.7940725518637, 293.975707043625, 294.1567981826859, 294.3373473936488, 294.51735609883394, 294.69682571828247, 294.87575766973856, 295.0541533686482, 295.23201422814503, 295.40934165904605, 295.5861370698466, 295.7624018667035, 295.9381374534376, 296.11334523152203, 296.2880266000706, 296.46218295583986, 296.6358156932132, 296.80892620420235, 296.9815158784337, 297.15358610314047, 297.32513826316483, 297.49617374094504, 297.6666939165077, 297.8367001674672, 298.00619386901633, 298.17517639391826, 298.34364911250555, 298.511613392668, 298.67907059985663, 298.84602209706463, 299.0124692448366, 299.1784134012509, 299.34385592192433, 299.50879815999775, 299.6732414661372, 299.83718718852765, 300.00063667286867, 300.16359126236836, 300.3260522977385, 300.4880211171918, 300.6494990564361, 300.8104874486704, 300.97098762458097, 301.13100091233594, 301.2905286375838, 301.44957212344696, 301.60813269051994, 301.766211656864, 301.92381033800183, 302.0809300469213, 302.23757209406057, 302.3937377873182, 302.54942843203435, 302.70464533100346, 302.8593897844605, 303.0136630900783, 303.1674665429726, 303.32080143568993, 303.47366905820917, 303.6260706979414, 303.7780076397189, 303.92948116580516, 304.0804925558782, 304.2310430870421, 304.3811340338113, 304.5307666681185, 304.6799422593103, 304.8286620741402, 304.9769273767728, 305.12473942878086, 305.2720994891379, 305.4190088142212, 305.5654686578131, 305.7114802710932, 305.8570449026385, 306.00216379842436, 306.14683820182063, 306.2910693535919, 306.4348584918932, 306.57820685227676, 306.72111566767865, 306.86358616842875, 307.0056195822431, 307.14721713422585, 307.28838004687015, 307.4291095400507, 307.56940683103113, 307.7092731344583, 307.848709662361, 307.9877176241559, 308.126298226638, 308.26445267398714, 308.4021821677665, 308.53948790691635, 308.676371087764, 308.8128329040163, 308.9488745467594, 309.0844972044641, 309.2197020629809, 309.3544903055407, 309.48886311275885, 309.6228216626282, 309.7563671305274, 309.8895006892142, 310.0222235088306, 310.15453675690304, 310.28644159833823, 310.41793919542835, 310.54903070784894, 310.67971729266156, 310.8100001043161, 310.9398802946417, 311.0693590128601, 311.19843740557917, 311.32711661679804, 311.45539778790294, 311.5832820576705, 311.71077056226994, 311.83786443526253, 311.9645648076038, 312.09087280764527, 312.21678956113095, 312.3423161912063, 312.46745381841265, 312.5922035606926, 312.7165665333886, 312.8405438492472, 312.9641366184172, 313.0873459484544, 313.210172944321, 313.33261870838794, 313.45468434043704, 313.5763709376608, 313.6976795946668, 313.81861140347513, 313.93916745352556, 314.0593488316782, 314.179156622208, 314.2985919068183, 314.4176557646348, 314.5363492722072, 314.65467350351923, 314.7726295299785, 314.89021842043275, 315.0074412411558, 315.12429905586595, 315.24079292571423, 315.35692390929876, 315.47269306265633, 315.5881014392708, 315.70315009007487, 315.81784006345083, 315.932172405233, 316.0461481587122, 316.1597683646359, 316.27303406121115, 316.3859462841088, 316.49850606646334, 316.6107144388766, 316.7225724294226, 316.8340810636464, 316.94524136456806, 317.05605435268774, 317.1665210459836, 317.2766424599193, 317.3864196074439, 317.4958534989975, 317.6049451425083, 317.7136955434014, 317.82210570460103, 317.93017662652727, 318.0379093071087, 318.14530474177724, 318.2523639234746, 318.35908784265575, 318.465477487287, 318.5715338428589, 318.6772578923796, 318.78265061638245, 318.8877129929287, 318.99244599761033, 319.09685060355184, 319.2009277814181, 319.30467849941033, 319.408103723276, 319.51120441630803, 319.61398153934886, 319.7164360507956, 319.81856890660043, 319.9203810602777, 320.0218734629024, 320.12304706311767, 320.2239028071382, 320.3244416387466, 320.42466449930845, 320.5245723277676, 320.62416606065096, 320.72344663207235, 320.82241497373724, 320.92107201494684, 321.0194186825957, 321.1174559011841, 321.2151845928158, 321.31260567720125, 321.409720071667, 321.5065286911524, 321.6030324482165, 321.6992322530426, 321.7951290134386, 321.8907236348466, 321.9860170203378, 322.0810100706248, 322.1757036840595, 322.2700987566415, 322.364196182019, 322.457996851489, 322.5515016540109, 322.6447114762008, 322.73762720234157, 322.8302497143805, 322.9225798919389, 323.01461861231445, 323.1063667504848, 323.1978251791085, 323.28899476853206, 323.37987638679647, 323.4704708996342, 323.5607791704777, 323.65080206046264, 323.7405404284325, 323.82999513094074, 323.9191670222557, 324.0080569543648, 324.0966657769783, 324.18499433753385, 324.27304348119833, 324.36081405087543, 324.4483068872065, 324.5355228285773, 324.6224627111169, 324.7091273687106, 324.79551763299474, 324.88163433336695, 324.9674782969869, 325.0530503487814, 325.1383513114509, 325.223382005469, 325.30814324909005, 325.3926358583525, 325.4768606470817, 325.56081842689565, 325.64451000720703, 325.727936195233, 325.8110977959901, 325.8939956123072, 325.9766304448236, 326.0590030919969, 326.14111435010744, 326.2229650132559, 326.30455587338, 326.3858877202421, 326.4669613414513, 326.5477775224535, 326.628337046543, 326.7086406948637, 326.78868924641546, 326.8684834780567, 326.9480241645095, 327.0273120783624, 327.1063479900757, 327.1851326679904, 327.263666878319, 327.3419513851661, 327.41998695052234, 327.49777433427255, 327.57531429419794, 327.6526075859805, 327.72965496320916, 327.8064571773842, 327.8830149779186, 327.95932911214436, 328.0354003253201, 328.1112293606252, 328.18681695917553, 328.26216386002204, 328.3372708001539, 328.41213851450755, 328.4867677359692, 328.56115919537206, 328.6353136215147, 328.7092317411511, 328.78291427900587, 328.8563619577707, 328.92957549811524, 329.0025556186841, 329.0753030361115, 329.14781846500995, 329.2201026179948, 329.2921562056685, 329.36397993664104, 329.43557451752366, 329.50694065293584, 329.5780790455147, 329.64899039591074, 329.71967540280224, 329.79013476288895, 329.86036917090473, 329.9303793196154, 330.00016589983113, 330.0697296004017, 330.1390711082276, 330.20819110826056, 330.2770902835116, 330.34576931504864, 330.41422888200856, 330.4824696615981, 330.5504923290966, 330.61829755786107, 330.68588601933544, 330.75325838304684, 330.8204153166154, 330.8873574857568, 330.9540855542866, 331.0206001841272, 331.08690203530506, 331.1529917659646, 331.2188700323628, 331.28453748888194, 331.3499947880292, 331.4152425804416, 331.4802815148936, 331.54511223829167, 331.60973539569375, 331.6741516303004, 331.73836158346506, 331.8023658946967, 331.86616520166484, 331.9297601402045, 331.9931513443201, 332.0563394461873, 332.11932507616217, 332.182108862778, 332.24469143275763, 332.30707341101623, 332.36925542065944, 332.4312380829914, 332.49302201752306, 332.5546078419722, 332.61599617226534, 332.67718762254646, 332.7381828051816, 332.7989823307596, 332.85958680809466, 332.91999684424263, 332.9802130444881, 333.04023601235946, 333.100066349632, 333.15970465633245, 333.21915153073667, 333.2784075693839, 333.33747336707347, 333.39634951686946, 333.45503661011014, 333.5135352364086, 333.5718459836566, 333.6299694380288, 333.68790618398765, 333.7456568042904, 333.80322187998615, 333.86060199042674, 333.91779771326935, 333.9748096244767, 334.03163829832704, 334.08828430741465, 334.1447482226544, 334.2010306132897, 334.2571320468875, 334.31305308935373, 334.3687943049296, 334.42435625619856, 334.4797395040885, 334.5349446078824, 334.58997212521217, 334.64482261207104, 334.6994966228111, 334.75399471015635, 334.8083174251982, 334.8624653174025, 334.9164389346176, 334.9702388230687, 335.0238655273744, 335.077319590538, 335.13060155396505, 335.1837119574556, 335.2366513392137, 335.2894202358521, 335.3420191823923, 335.3944487122756, 335.4467093573581, 335.49880164792364, 335.55072611267985, 335.6024832787705, 335.6540736717689, 335.70549781569287, 335.7567562330021, 335.8078494446046, 335.8587779698578, 335.90954232657964, 335.9601430310408, 336.01058059798066, 336.0608555406037, 336.1109683705878, 336.160919598085, 336.2107097317271, 336.26033927862983, 336.3098087443929, 336.3591186331126, 336.40826944737563, 336.4572616882698, 336.50609585538814, 336.5547724468262, 336.60329195919337, 336.65165488761323, 336.69986172572584, 336.7479129656963, 336.79580909821584, 336.8435506125055, 336.8911379963191, 336.9385717359502, 336.98585231623395, 337.03298022055094, 337.07995593082944, 337.1267799275539, 337.1734526897655, 337.2199746950643, 337.2663464196183, 337.3125683381602, 337.35864092399754, 337.4045646490171, 337.45033998367796, 337.49596739703065, 337.5414473567094, 337.58678032893954, 337.6319667785436, 337.6770071689413, 337.72190196215547, 337.76665161881465, 337.8112565981606, 337.855717358045, 337.90003435493685, 337.9442080439307, 337.98823887874255, 338.032127311718, 338.0758737938349, 338.11947877470885, 338.162942702592, 338.2062660243816, 338.2494491856231, 338.29249263051145, 338.3353968018981, 338.3781621412865, 338.4207890888501, 338.4632780834209, 338.5056295625045, 338.5478439622765, 338.5899217175896, 338.6318632619763, 338.67366902765366, 338.71533944552203, 338.75687494517604, 338.7982759549056, 338.8395429016921, 338.88067621122497, 338.92167630789527, 338.96254361480436, 339.00327855376406, 339.0438815453013, 339.08435300866216, 339.12469336181584, 339.16490302146144, 339.20498240301873, 339.2449319206505, 339.2847519872491, 339.3244430144505, 339.3640054126333, 339.40343959092047, 339.44274595719196, 339.4819249180767, 339.5209768789613, 339.5599022439947, 339.59870141609156, 339.6373747969307, 339.67592278696344, 339.7143457854176, 339.75264419029764, 339.7908183983883, 339.82886880526314, 339.86679580527806, 339.90459979158373, 339.94228115612884, 339.97984028965556, 340.01727758170887, 340.0545934206399, 340.09178819360784, 340.12886228658596, 340.1658160843567, 340.2026499705271, 340.23936432752333, 340.27595953659437, 340.31243597782293, 340.34879403011854, 340.3850340712278, 340.4211564777353, 340.4571616250671, 340.49304988749475, 340.5288216381342, 340.56447724895867, 340.600017090793, 340.6354415333173, 340.6707509450783, 340.70594569348094, 340.7410261448012, 340.775992664185, 340.81084561565257, 340.84558536210153, 340.88021226530714, 340.9147266859326, 340.94912898352123, 340.98341951651287, 341.0175986422391, 341.05166671692206, 341.08562409568947, 341.11947113257037, 341.15320818049435, 341.18683559130744, 341.2203537157605, 341.2537629035255, 341.28706350318475, 341.32025586224927, 341.3533403271503, 341.38631724324813, 341.4191869548309, 341.45194980512247, 341.48460613628254, 341.51715628941076, 341.54960060454846, 341.5819394206826, 341.61417307574857, 341.64630190663405, 341.6783262491839, 341.71024643819817, 341.74206280743425, 341.77377568962004, 341.80538541644444, 341.8368923185715, 341.8682967256331, 341.89959896623895, 341.93079936797767, 341.96189825741817, 341.9928959601153, 342.02379280061, 342.054589102436, 342.08528518811585, 342.1158813791738, 342.14637799612996, 342.17677535850567, 342.20707378483127, 342.2372735926401, 342.2673750984815, 342.2973786179137, 342.3272844655126, 342.3570929548752, 342.3868043986222, 342.416419108393, 342.44593739486066, 342.4753595677273, 342.5046859357283, 342.53391680663617, 342.5630524872617, 342.5920932834587, 342.6210395001244, 342.6498914412071, 342.6786494097014, 342.70731370765674, 342.7358846361773, 342.76436249543013, 342.7927475846399, 342.8210402020963, 342.8492406451575, 342.87734921024895, 342.90536619287167, 342.9332918876, 342.96112658808477, 342.9888705870625, 343.0165241763472, 343.0440876468416, 343.0715612885393, 343.09894539052135, 343.12624024096607, 343.15344612714637, 343.1805633354365, 343.2075921513114, 343.2345328593517, 343.2613857432448, 343.2881510857898, 343.31482916889615, 343.34142027358973, 343.36792468001516, 343.3943426674369, 343.42067451424094, 343.4469204979427, 343.47308089518117, 343.49915598173203, 343.52514603250086, 343.55105132152994, 343.57687212199886, 343.6026087062323, 343.6282613456931, 343.65383031099685, 343.67931587190355, 343.7047182973259, 343.73003785532956, 343.75527481314015, 343.7804294371376, 343.8055019928659, 343.8304927450328, 343.8554019575124, 343.88022989334695, 343.9049768147523, 343.92964298311466, 343.95422865900144, 343.9787341021536, 344.00315957149763, 344.0275053251409, 344.05177162037984, 344.07595871369705, 344.10006686076736, 344.12409631645727, 344.14804733483203, 344.171920169155, 344.19571507188726, 344.2194322946957, 344.2430720884514, 344.26663470323444, 344.2901203883347, 344.3135293922543, 344.3368619627095, 344.3601183466377, 344.38329879019153, 344.4064035387479, 344.42943283691005, 344.4523869285014, 344.4752660565813, 344.49807046343807, 344.520800390594, 344.54345607880697, 344.56603776807214, 344.58854569762804, 344.61098010595384, 344.6333412307743, 344.6556293090637, 344.67784457704226, 344.69998727018714, 344.72205762322386, 344.74405587014064, 344.7659822441794, 344.78783697784627, 344.80962030291084, 344.83133245040284, 344.85297365062974, 344.8745441331593, 344.89604412683633, 344.9174738597779, 344.9388335593804, 344.9601234523161, 344.98134376454027, 345.00249472129053, 345.02357654708874, 345.0445894657472, 345.0655337003638, 345.0864094733312, 345.1072170063345, 345.12795652035834, 345.1486282356811, 345.16923237188183, 345.1897691478458, 345.2102387817592, 345.23064149111775, 345.2509774927241, 345.27124700269275, 345.29145023645077, 345.3115874087419, 345.331658733626, 345.3516644244799, 345.3716046940065, 345.39147975422935, 345.4112898164974, 345.43103509148904, 345.4507157892098, 345.47033211900026, 345.4898842895316, 345.5093725088116, 345.52879698418883, 345.5481579223457, 345.567455529313, 345.5866900104592, 345.6058615705059, 345.624970413517, 345.64401674290576, 345.66300076144296, 345.6819226712494, 345.7007826737986, 345.71958096992915, 345.7383177598352, 345.7569932430722, 345.77560761856006, 345.7941610845869, 345.8126538388058, 345.8310860782375, 345.8494579992787, 345.86776979769866, 345.88602166863785, 345.90421380661917, 345.9223464055427, 345.94041965868945, 345.9584337587232, 345.9763888976924, 345.9942852670343, 346.01212305757446, 346.0299024595246, 346.0476236624969, 346.0652868554893, 346.0828922269007, 346.1004399645311, 346.1179302555737, 346.13536328662633, 346.15273924369245, 346.1700583121775, 346.1873206768973, 346.2045265220744, 346.22167603134466, 346.2387693877533, 346.2558067737634, 346.2727883712559, 346.28971436152347, 346.30658492528266, 346.32340024267404, 346.3401604932593, 346.3568658560251, 346.37351650938587, 346.3901126311839, 346.4066543986963, 346.4231419886263, 346.43957557711695, 346.4559553397445, 346.4722814515224, 346.4885540869063, 346.5047734197887, 346.52093962351034, 346.5370528708525, 346.5531133340454, 346.5691211847647, 346.5850765941388, 346.60097973274634, 346.61683077061736, 346.63262987723925, 346.64837722155653, 346.66407297197077, 346.67971729634354, 346.6953103619962, 346.7108523357159, 346.72634338375684, 346.7417836718344, 346.75717336513895, 346.7725126283239, 346.7878016255182, 346.8030405203253, 346.8182294758194, 346.83336865455533, 346.8484582185626, 346.863498329355, 346.878489147923, 346.8934308347429, 346.9083235497769, 346.9231674524686, 346.9379627017545, 346.95270945605733, 346.9674078732935, 346.9820581108686, 346.99666032568774, 347.01121467414714, 347.0257213121421, 347.0401803950671, 347.0545920778168, 347.06895651478635, 347.0832738598794, 347.09754426650005, 347.1117678875601, 347.12594487548034, 347.14007538219204, 347.154159559138, 347.16819755727266, 347.1821895270648, 347.1961356184995, 347.2100359810805, 347.2238907638285, 347.2377001152854, 347.25146418351557, 347.26518311610823, 347.2788570601736, 347.29248616235105, 347.3060705688089, 347.3196104252431, 347.3331058768808, 347.3465570684816, 347.35996414433794, 347.373327248281, 347.3866465236745, 347.39992211342275, 347.41315415996957, 347.4263428052994, 347.4394881909388, 347.45259045795893, 347.4656497469763]
//Min. Objective: 258.43883413568597
//Predicted output for6.75: 177.04513229659838
//Compared to 6.41: 177.9
//Compared to 8.32: 210.3