

var nam = prompt("Your Name: ");

var num1 = prompt("English: ");
var num2 = prompt("Maths: ");
var num3 = prompt("Science: ");

var english = parseInt(num1);
var maths = parseInt(num2);
var science = parseInt(num3);

averageGrade = (english + maths + science)/3;

if (averageGrade <= 100 && averageGrade >= 90) {

    console.log(nam + " your grade is A");

} else if(averageGrade < 90 && averageGrade >= 80){

    console.log(nam + " your grade is B");

} else if(averageGrade < 80 && averageGrade >= 70){

    console.log(nam + " your grade is C");

} else if(averageGrade < 70 && averageGrade >= 60){

    console.log(nam + " your grade is D");

} else if(averageGrade < 60 && averageGrade >= 50){

    console.log(nam + " your grade is E");
} else{

    console.log(nam + " you failed" );
}