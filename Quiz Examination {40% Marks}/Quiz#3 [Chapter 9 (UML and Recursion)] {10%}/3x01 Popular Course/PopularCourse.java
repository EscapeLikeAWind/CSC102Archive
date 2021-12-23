import java.util.*;

public class PopularCourse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> courses = new HashMap<String,Integer>();
        String temp = sc.nextLine();
        while (temp.equals("end") == false){
            if (courses.containsKey(temp.substring(0, 6))){
                courses.put(temp.substring(0, 6), courses.get(temp.substring(0, 6)) + Integer.parseInt(temp.substring(7,temp.length())));
                temp = sc.nextLine();
                continue;
            }
            courses.put(temp.substring(0, 6), Integer.parseInt(temp.substring(7,temp.length())));
            temp = sc.nextLine();
        }
        sc.close();

        for(int v: courses.values()){
            if(v == Collections.max(courses.values())){
                for(Map.Entry<String, Integer> m: courses.entrySet()){
                    String course = m.getKey();
                    Integer student = m.getValue();
                    if(student == v){
                        System.out.println(course + "," + v);
                    } 
                }
            }
        }
    }
}