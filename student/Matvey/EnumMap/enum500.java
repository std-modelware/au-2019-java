package to11.november.EnumMap;
import java.util.EnumMap;

public class enum500 {

    public enum myEnum500{
        enum0, enum1, enum2, enum3, enum4, enum5, enum6, enum7, enum8, enum9, enum10, enum11, enum12, enum13, enum14,
        enum15, enum16, enum17, enum18, enum19, enum20, enum21, enum22, enum23, enum24, enum25, enum26, enum27, enum28, enum29,
        enum30, enum31, enum32, enum33, enum34, enum35, enum36, enum37, enum38, enum39, enum40, enum41, enum42, enum43, enum44,
        enum45, enum46, enum47, enum48, enum49, enum50, enum51, enum52, enum53, enum54, enum55, enum56, enum57, enum58, enum59,
        enum60, enum61, enum62, enum63, enum64, enum65, enum66, enum67, enum68, enum69, enum70, enum71, enum72, enum73, enum74,
        enum75, enum76, enum77, enum78, enum79, enum80, enum81, enum82, enum83, enum84, enum85, enum86, enum87, enum88, enum89,
        enum90, enum91, enum92, enum93, enum94, enum95, enum96, enum97, enum98, enum99, enum100, enum101, enum102, enum103, enum104,
        enum105, enum106, enum107, enum108, enum109, enum110, enum111, enum112, enum113, enum114, enum115, enum116, enum117, enum118, enum119,
        enum120, enum121, enum122, enum123, enum124, enum125, enum126, enum127, enum128, enum129, enum130, enum131, enum132, enum133, enum134,
        enum135, enum136, enum137, enum138, enum139, enum140, enum141, enum142, enum143, enum144, enum145, enum146, enum147, enum148, enum149,
        enum150, enum151, enum152, enum153, enum154, enum155, enum156, enum157, enum158, enum159, enum160, enum161, enum162, enum163, enum164,
        enum165, enum166, enum167, enum168, enum169, enum170, enum171, enum172, enum173, enum174, enum175, enum176, enum177, enum178, enum179,
        enum180, enum181, enum182, enum183, enum184, enum185, enum186, enum187, enum188, enum189, enum190, enum191, enum192, enum193, enum194,
        enum195, enum196, enum197, enum198, enum199, enum200, enum201, enum202, enum203, enum204, enum205, enum206, enum207, enum208, enum209,
        enum210, enum211, enum212, enum213, enum214, enum215, enum216, enum217, enum218, enum219, enum220, enum221, enum222, enum223, enum224,
        enum225, enum226, enum227, enum228, enum229, enum230, enum231, enum232, enum233, enum234, enum235, enum236, enum237, enum238, enum239,
        enum240, enum241, enum242, enum243, enum244, enum245, enum246, enum247, enum248, enum249, enum250, enum251, enum252, enum253, enum254,
        enum255, enum256, enum257, enum258, enum259, enum260, enum261, enum262, enum263, enum264, enum265, enum266, enum267, enum268, enum269,
        enum270, enum271, enum272, enum273, enum274, enum275, enum276, enum277, enum278, enum279, enum280, enum281, enum282, enum283, enum284,
        enum285, enum286, enum287, enum288, enum289, enum290, enum291, enum292, enum293, enum294, enum295, enum296, enum297, enum298, enum299,
        enum300, enum301, enum302, enum303, enum304, enum305, enum306, enum307, enum308, enum309, enum310, enum311, enum312, enum313, enum314,
        enum315, enum316, enum317, enum318, enum319, enum320, enum321, enum322, enum323, enum324, enum325, enum326, enum327, enum328, enum329,
        enum330, enum331, enum332, enum333, enum334, enum335, enum336, enum337, enum338, enum339, enum340, enum341, enum342, enum343, enum344,
        enum345, enum346, enum347, enum348, enum349, enum350, enum351, enum352, enum353, enum354, enum355, enum356, enum357, enum358, enum359,
        enum360, enum361, enum362, enum363, enum364, enum365, enum366, enum367, enum368, enum369, enum370, enum371, enum372, enum373, enum374,
        enum375, enum376, enum377, enum378, enum379, enum380, enum381, enum382, enum383, enum384, enum385, enum386, enum387, enum388, enum389,
        enum390, enum391, enum392, enum393, enum394, enum395, enum396, enum397, enum398, enum399, enum400, enum401, enum402, enum403, enum404,
        enum405, enum406, enum407, enum408, enum409, enum410, enum411, enum412, enum413, enum414, enum415, enum416, enum417, enum418, enum419,
        enum420, enum421, enum422, enum423, enum424, enum425, enum426, enum427, enum428, enum429, enum430, enum431, enum432, enum433, enum434,
        enum435, enum436, enum437, enum438, enum439, enum440, enum441, enum442, enum443, enum444, enum445, enum446, enum447, enum448, enum449,
        enum450, enum451, enum452, enum453, enum454, enum455, enum456, enum457, enum458, enum459, enum460, enum461, enum462, enum463, enum464,
        enum465, enum466, enum467, enum468, enum469, enum470, enum471, enum472, enum473, enum474, enum475, enum476, enum477, enum478, enum479,
        enum480, enum481, enum482, enum483, enum484, enum485, enum486, enum487, enum488, enum489, enum490, enum491, enum492, enum493, enum494,
        enum495, enum496, enum497, enum498, enum499
    }

    public static void main(String[] args){
        EnumMap<myEnum500, Integer> m = new EnumMap<myEnum500, Integer>(myEnum500.class);
        long c1 = 0;
        long c2 = 0;
        long c3 = 0;

        for(int j=0;j<1000;j++) {
            int n = 500;
            long t1 = System.nanoTime();
            for (myEnum500 i : myEnum500.values()) {
                m.put(i, --n);
            }
            long t2 = System.nanoTime();
            for (myEnum500 i : myEnum500.values()) {
                n = m.get(i);
            }
            long t3 = System.nanoTime();
            for (myEnum500 i : myEnum500.values()) {
                m.put(i, m.get(i) + 1);
            }
            long t4 = System.nanoTime();
            m.clear();

            c1 = c1 + t2 - t1;
            c2 = c2 + t3 - t2;
            c3 = c3 + t4 - t3;
        }
        System.out.println(c1/1000);
        System.out.println(c2/1000);
        System.out.println(c3/1000);
    }
}
