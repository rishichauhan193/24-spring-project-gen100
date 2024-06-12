<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Box Cricket Registration</title>
</head>
<body>
	<h1><u>Box Cricket Registration:-</u></h1><br><br>

	<form action="savereg" method="post">
		Enter Your Name  : <input type="text" name="studentName" value="${studentNameValue}"/><span style="color:red">${studentNameError}</span><br><br><br>
		
		Playing Type :  &nbsp;&nbsp;&nbsp;   
						Batsman <input type="radio" name="playerType" value="Batsman" ${playerTypeValue != null && playerTypeValue.equals("Batsman")?"checked":""}/>&nbsp;&nbsp;&nbsp;
						Bowller <input type="radio" name="playerType" value="Bowller" ${playerTypeValue != null && playerTypeValue.equals("Bowller")?"checked":""}/>&nbsp;&nbsp;&nbsp;
						Wicketkeeper <input type="radio" name="playerType" value="Wicketkeeper" ${playerTypeValue != null && playerTypeValue.equals("Wicketkeeper")?"checked":""}/>&nbsp;&nbsp;&nbsp;
						AllRounder 	 <input type="radio" name="playerType" value="AllRounder"${playerTypeValue != null && playerTypeValue.equals("AllRounder")?"checked":""}/><span style="color:red">${playerTypeError}</span>
						<br><br><br> 
						
		Food Preference : 
					<select name="foodPreference">
						<option value = "-1">---Select Your Food Preference---</option>
						<option value="Regular" ${foodPreferenceValue != null && foodPreferenceValue.equals("Regular")?"selected":""}>Regular</option>
						<option value="Jain" ${foodPreferenceValue != null && foodPreferenceValue.equals("Jain")?"selected":""}>Jain</option>
						<option value="Swaminarayan" ${foodPreferenceValue != null && foodPreferenceValue.equals("Swaminarayan")?"selected":""}>Swaminarayan</option>
					</select>	<span style="color:red">${foodPreferenceError}</span>
					<br><br><br>
		Drinks : 
				RB<input type="checkbox" name="drink" value="RB" ${drinkValue.contains("RB")? "checked":""}/> &nbsp;&nbsp;&nbsp;
				MD<input type="checkbox" name="drink" value="MD"${drinkValue.contains("MD")? "checked":""}/> &nbsp;&nbsp;&nbsp;
				TH<input type="checkbox" name="drink" value="TH" ${drinkValue.contains("TH")? "checked":""}/> &nbsp;&nbsp;&nbsp;
				LJ<input type="checkbox" name="drink" value="LJ" ${drinkValue.contains("LJ")? "checked":""}/> &nbsp;&nbsp;&nbsp;
				CO <input type="checkbox" name="drink" value="CO" ${drinkValue.contains("CO")? "checked":""}/>
				<span style="color:red">${DrinkError}</span>
				<br><br><br>
				<input type="submit" value="Register"/>

	</form>

</body>
</html>