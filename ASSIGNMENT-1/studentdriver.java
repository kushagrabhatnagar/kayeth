import java.util.*;
class StudentDriver
{
	public static void main(String args[])
	{
		String firstName, lastName, eMail, contactNo, line1, line2, city, state;
		String qualName, institute, university, name, role;
		float cgpa;
		int i, j, k, l, m, n, p, q, s, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of students");
		n = scan.nextInt();
		Student[] student = new Student[n];
		for (i= 0; i< n; i++)
		{
        System.out.print("First Name: ");
		firstName = scan.next();
		System.out.print(" Last Name: ");
		lastName = scan.next();
        System.out.println("Enter Address--- ");
		System.out.print(" line1: ");
		line1 = scan.next();
        System.out.print(" line2: ");
		line2 = scan.next();
        System.out.print(" city: ");
		city = scan.next();
        System.out.print(" state: ");
		state = scan.next();
        System.out.print(" pincode: ");
		pinCode = scan.nextInt();		
        System.out.println(" Date of Birth: ");
		daydob = scan.nextInt();
		monthdob = scan.nextInt();
		yeardob = scan.nextInt();		
		System.out.print(" number of Skills: ");
		s= scan.nextInt();
		String[] sk = new String[s];
		for (m= 0; m< s; m++) 
		{
			System.out.print(" Skills: ");
			sk[m] = scan.next();
		}
        System.out.print(" number of Qualifications: ");
		q= scan.nextInt();
		Qualification[] ql = new Qualification[q];
		for (m= 0; m< q; m++) 
		{
			System.out.println(" details of Qualification---" + (m+1));
            System.out.print(" qualification name: ");
			qualName = scan.next();
            System.out.print(" university: ");
			university = scan.next();
            System.out.print(" institute: ");
			institute = scan.next();
            System.out.print(" cgpa: ");
			cgpa = scan.nextFloat();
			ql[m]= new Qualification(qualName, university, institute, cgpa);
        }
        System.out.print(" number of projects: ");
		p = scan.nextInt();
        Project[] pr = new Project[p];
	    for(m= 0; m< p; m++)
		{
			System.out.print(" project name: ");
			name = scan.next();
            System.out.print(" start date: ");
			startday = scan.nextInt();
			startmonth = scan.nextInt();
			startyear = scan.nextInt();
			System.out.println("end date: ");
			endday = scan.nextInt();
			endmonth = scan.nextInt();
			endyear = scan.nextInt();
			System.out.print(" role: ");
			role = scan.next();
			System.out.print(" number of responsibilities: ");
			l = scan.nextInt();
            String[] resp = new String[l];
			System.out.print(" responsibilities: ");
			for (j= 0; j< l; j++) 
			{
				resp[j] = scan.next();
			}
            pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);
			pr[m].setStart(startday, startmonth, startyear);
			pr[m].setEnd(endday, endmonth, endyear);
        }
        System.out.print(" Email: ");
		eMail = scan.next();
        System.out.print("Contact Number: ");
		contactNo = scan.next();
        student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, s, q, p);
		student[i].setProject(pr);
		student[i].setSkills(sk);
		student[i].setQual(ql);
		student[i].setDob(daydob, monthdob, yeardob);
		student[i].setAddress(line1, line2, city, state, pinCode);
		System.out.println("\n####################################################################################################");
		system.out.println("\nprogram by 18csu113");
		student[i].displayDetails(p, q, s);
        }
	}
}