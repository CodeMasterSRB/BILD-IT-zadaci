package zadaci_11_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import zadaci_11_03_2017.FacultyMember.Rank;

public class LargeDataset {
	
	
	private static ArrayList<FacultyMember> putMembersInList(){
		
		ArrayList<FacultyMember> members = new ArrayList<>();
		
		double salary;
		Rank rank;
		
		for (int i = 1; i <= 1000; i++) {
			int choice = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			
			if (choice == 0) {
				rank = Rank.ASSISTENT;
				salary = ThreadLocalRandom.current().nextInt(50000, 80000 + 1);
			}else if(choice == 1){
				rank = Rank.ASSOCIATE;
				salary = ThreadLocalRandom.current().nextInt(60000, 100000+1);
			}else{
				rank = Rank.FULL;
				salary = ThreadLocalRandom.current().nextInt(75000, 130000);
			}
			
			members.add(new FacultyMember("FirstName" + i, "LastName" + i, salary,  rank));
		}
		
		return members;
		
	}
	
	private static void writeMembersToTheList(ArrayList<FacultyMember> members) throws IOException{
		Path path = Paths.get("Salary.txt");
		
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		
		try (BufferedWriter bw = Files.newBufferedWriter(path)){
			
			for (int i = 0; i < members.size(); i++) {
				bw.write(members.get(i).toString());
				bw.newLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
				
		try {
			ArrayList<FacultyMember> members = putMembersInList();
			writeMembersToTheList(members);
	
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

	}

}
