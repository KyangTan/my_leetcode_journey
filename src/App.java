import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // String s = "eleetminicoworoep";
        // String s = "leetcodeisgreat";
        String s = "bcbcbc";
        // String s = "lffjsdhuyanjfesetkrgdkvpgjtwzbwtgfkvqggundksswifayuwwqjmrmmckkeiitofogmpcyowdrfijnjxzjgluwevtygrudzngiyrrvuhevzsvczkbxyoiuwbvbthbxlcfvfggzutbqttwuqavnpyubrhqhvdknfbqtmjlaokmopplxufnbvwqkisbamepgmrtxofhqbtfnoxsuxagbstmcwqmaezhwmkgdumkbtcgllwbunsjnjuqfxfzqsevwasangzhodanfrjqxoxvfztsmgzzwjkdudrdpbzrmlrbdoibskxoejobejrdzsducnnqcnlrsfwsppwuwtqynjyoohgszrgebixayoovfgjrjecfqcvffnfgynzikyverhnkxyayyxxhfujbdhtvansaqbfvztazroxxnuelmhyvspwruidqxjajuqybjbclldvqoiwbbriklhyizpiyychnmpftnonhoyqucxqmmggtebueollzzvzdihkjavinoiukzwwcwxainwehtltmyahrwxfhvdgdgxuhbnxkexvaoutgbtzbwydbglcmstgvkmjftjjislhhdxmeljltqslbqbcnkqlrhjqjmqrkferdvtevhwjnniqutzvuljoobornasdjtqfucdhlolvjeiyvdxezvpkrhlbbdfpovqcmbsxecjautohtzxhgwersmesweflvblaxvvpocbwwozemuiybbqbfhtxjqdysjfbsdpeyidrzcvkezhhksozlsywvascxisrfaxruyltjrfuaprflszqlwyrnpplndvcdzhzkgbwztswbslhyytznmbvbnyzxsyivslwcdkflmofxfnwpgaqxfgvufvctxxttacgoibzminxhodcgggafnupokfvgncmwllcqvoqvrwagillaghnklvtoowxxdxrybugykcniwvyhbjdjseznlqczjcopfhsaragzgktcsmnqzumvskmojqlgerujrdxplmwfvbcpvbmesxefqcxmrgqmylwsnfnsihyxsltqazzywjjqyiegyobzyidxvcbuucpepotmhvbnfbjobequugguwfgeamuaymtllkekkrwkubkoyyfcaxapvdgmtqntdiqnbzyogbrawxjncklsmbtviegafobtsznwdrbqfwuvuocaraeharbqusvhtwnwdplkfxvghcugfwjccwgexcoyyilhefsyhnclqrfybyrvbiarxspngszdlwkqqsxtyvyifxsjzjpqkqutndbccjtnumlkscwersxoqnhrzixnkujfbdxdodxpywlidkmdfqxroxzqcpksdkdydrhphpkbfbanvkjrtxhlevyxycugybfyywlnvigfgmyqffhoettytyjskfvkrstjhzgfjbeeanblwoengfrlxfxcwilkbqjvextpubzouyntcaaybaayglgobwbhjgryfgsglrgxeswdkfrzuovparpcaoksllnewddovzkfucmaqoavytejzijbppbsezaptnbhdxmvrqasjaahqwumiulxagtxngxoqybezrtiubdmdbptpedwpifbdrocfkoyrfwpxliwyjpfvjqafhdxmcdjzzwdivhfyvldodkqrcosncqtdotpimopmmdmkzuwacfpnacxmvqtkbyaquaoxqfojwncqxtgnkpynumvuaswxqurdfymrzeigpxekxxrudftwuzpajbvrdipxfniljkifqsgttrdtfidgbvveqyusyvuxvoxurdrryhfnntyfbkwzakywfelhvsbwzxnufksguhpjisuqqwsyqphyyfwcshoemfawdxbbrbtpyoxapijixmpdcjumnghqecwwxjgzdlyiehllfxyddxgjhucbktxmgltvwcyookvjkvyqaqcefaahgywvxxnjufdmqqatgcgfkgyzxkzhilmwkbogyvdoemmgkkhpomxaoluupkbomvtwsvppwvjbqohcujufogifrjxmagstpajuxyizricymbsrwbgwpygmkjptqiwzitfmmpzrhhntocwymbawglgdwbpgbvfkbvqiggznqcsfibeawyzbsrgxfkefwmsyaaskquyagcyxpocfiqaznjsrsgfkdxsjwjgsqdaiggyhrgpkmztpxdlcoipxbakpwahrebmdhbjtlddiixehrxtepbnowaakunjpbxoknuafilhcetwkmrrswjyqyklzpetgngdycfauacoqscflqzruffxncodapyulmxeslethmkgzqyurdjogsvoeibfgwprgbmulpqnhgyucaezptwgpimdqcdlfgvnjniyquhmnbbxxglmkyniowmfewnlwvlsylqnblydkbgxtlfrysxjprfnllafftlzwwpuovrgdkuxanhojnicrgodubywaryshhbtpvkggdawyjuiwdelonkzywbqjcohfsssgqjysuspjvidruiffqxtfnwjmmhfnfrrkhgyejwvcucwhdujyaemmubdtbeomjhfphushtiqynzosswjeuvqzebeuresaqirrfwblprztfhkuyufwgvfzspvxhegbqkzhmowiwfdbcbjpbdujztlzlhgigfkivxklbcgfmuogtaommlvlpttauixczvbmnlzwmfjugytcjanboamgrtpziatwxghvueytwkzhuikbmjauoanadfvhamtoeycggynsswllcxzhgdetilwxkninlvhcozhuiuaqtkglsvjlwgvlkrrincmgxoxsggkpoabjeqmcjrsekkmpuvseihhmwslttrxbjoqwluaeppyabmuwnxdgvnxlnomncpfqvgfdxnzlhfmwslwtlervfzzhirhuzczcgsnpybkhcnckfzphlxssgzjfoyxydvadirjzdxjgoxhxanyckoooruhnimtcsmvmddlyllmppgugzezgdxaswfpkijcgywtyrezviwhdsyjqnksrleqoqhukgrxkeremwjbawbnlbqosxvouqjrmmvykipcazekculbbumkgenhjkahgimjpmpytoyiaoooqnxztgtlunffvszorltqagxdlxbuwockudcqlhwckehlhihqmsbaiyxipdpvnidblplrtignxmfsyulcrojpxlgkmylfolirxehxfkvwadegerqbmyeekpodamemcxtecqijesxxkvwdsocqyuagqylwodgaszazvrdjuvanurfrttixfbasggfxwdulbvwvvjdtfgabhfnsheaqopbepiorywlsktvonhxloppagkgdkobywfivrhowneyfszbqskpxvwjriiqqmhqhkjisksmihttcupfzyylrvsfrtcopvlkcrqghvwelkrqqrffuygsggrbsungonkvakfehnrpfqddsdatofcrcewanzigluouypzotpousidkkcosvmimkcjeiuvaefftmdhmfwjltqemdtmlhadgwymcasllmdetyfggohqfoiphmaadfbhkkdnpeubislwgrkpejxjalpaytzhhbrvrjfpjrcgdfsakeqxexbgfhevhruhhwxsjqtnhxsemsvvxsyevfmmqevdsqergvfphpckbpeoeqyrmmdzafgtshitmibbpoucyynengtaaixahewgvpsiufqxgilmtazymycrxnjajdgpdluhvtftaummsbfureuiptxmedlxothitffouogmucgwznfobcbveengtmqdknzvzzysmjwgnbbykimpjckyzsebcbfpknxbodxpigmfnhxlmywdwptmkzuxxuvhbcixbsgngrtxgbcjuyctaqvzayvzeofbubuyhhgraohnhuelbqrlnbzlxahpsmgwpiflujdazsqrmrmtssudexfiulbyzjgmuucobevbeeofefsekshtdlidbfdbtywhbjerawvfobnadfcbzbkptozixprdqzvrzthhjyrnpajyswpogxvmefzfckgpwadkxzaqktvhzegtqlgxkfynowfmllyjigzldltvwfxseifqqishhuoguviviuvpkfljauaqtmynjwleevsdcsstcydfhlbhlnnyriomuzaxrvwlyyowsmclsudlojdnyjzvpnoegzltxgmeqkbfqdcutwgaupzkpnftkxhbyjcabavxohtkktkdejziuyzrctmkpukfsjbjznarrtgeyvdxrsoyikddlnxuonmbtrkadgmhwjpnvlmoonczsjpjpcevcdvuxqmyfylyfcnqahzynsfqcobglkdehuapfpjgsiztsiobjkcpopbloplalgwzeccjnnkivvqvidmhxcpzefrqrlhjcyyfolyzogmbjiakufyjytmjgjwylwpjvixougyggjmbzarudlmlyhvcxbhuqurxlznwkkrjbyiioumtsmybrtzvibqyvhibxmvgkoiyzmjdrq";
        System.out.println(findTheLongestSubstring(s));
    }

    /* Best Solution
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int findTheLongestSubstring(String s) {
        int n = s.length();
        int mask = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') mask ^= (1 << 0);
            else if (c == 'e') mask ^= (1 << 1);
            else if (c == 'i') mask ^= (1 << 2);
            else if (c == 'o') mask ^= (1 << 3);
            else if (c == 'u') mask ^= (1 << 4);
            
            if (m.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - m.get(mask));
            } else {
                m.put(mask, i);
            }
        }
        return maxLength;
    }
}
