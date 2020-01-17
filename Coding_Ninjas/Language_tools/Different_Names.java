package Coding_Ninjas.Language_tools;
/*
                        Name: Rudransh Awasthi
 */
/*
    Different Names
        In Little Flowers Public School, there are many students with same first names. You are given a task to
        find the students with same names. You will be given a string comprising of all the names of students
        and you have to tell the name and count of those students having same. If all the names are unique,
        print -1 instead.
        Note: We don't have to mention names whose frequency is 1.

    Input Format:
        The only line of input will have a string ‘str’ with space separated first names of students.

    Output Format:
        Print the names of students along with their count if they are repeating. If no name is repeating, print -1

    Constraints:
        1 <= |str| <= 10^5
        Time Limit: 1 second

    Sample Input 1:
        Abhishek harshit Ayush harshit Ayush Iti Deepak Ayush Iti
    Sample Output 1:
        harshit 2
        Ayush 3
        Iti 2

    Sample Input 2:
        Abhishek Harshit Ayush Iti
    Sample Output:
        -1
 */


import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Different_Names {
    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        HashMap<String, Integer> names = new HashMap<>();
        String str = z.nextLine();
        StringTokenizer s = new StringTokenizer(str);
        int l =s.countTokens();
        int i,flag;
        flag = 0;
        String name = null;
        for (i=0;i<l;i++) {
            name = s.nextToken();
            if(! names.containsKey(name))
                names.put(name,1);
            else
                names.replace(name,names.get(name)+1);

        }
        for(String na : names.keySet()) {
            if (names.get(na) > 1) {
                flag = 1;
                System.out.println(na + " "+ names.get(na));
            }
        }
        if (flag != 1)
            System.out.println(-1);
    }
}
