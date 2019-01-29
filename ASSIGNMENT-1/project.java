class Project
{
String name;
Date startDate;
Date endDate;
int startday, startmonth, startyear, endday, endmonth, endyear, r;
String role;
String[] responsibilities;
Project(String name, int startday, int startmonth, int startyear, int endday, int endmonth, int endyear, String role, int j)
{
    this.name = name;
	this.startDate = new Date(startday, startmonth, startyear);
	this.endDate = new Date(endday, endmonth, endyear);
	this.role = role;
	this.responsibilities = new String[j];
	this.r = j;
}
Project()
{
	this.name = "";
	this.startDate = new Date(01,01,2000);
	this.endDate = new Date(01,01,2000);
	this.role = "";
	this.responsibilities = new String[100];
}
public void setStart(int startday, int startmonth, int startyear)
{
