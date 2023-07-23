// const cars = ['Tesla', 'Mercedes', 'Honda']
// const [ randomCar ] = cars
// const [ ,otherRandomCar ] = cars
// const[, , therdcar]=cars
// //Predict the output
// console.log(randomCar)
// console.log(otherRandomCar)
// console.log(therdcar);


// const employee = {
//     name: 'Elon',
//     age: 47,
//     company: 'Tesla'
// }
// const { name: otherName } = employee;
// //Predict the output
// // console.log(name); becose the vale of the name now inside the othername
// console.log(otherName);

// const person = {
//     name: 'Phil Smith',
//     age: 47,
//     height: '6 feet'
// }
// const password = '12345'; //becose the definedof the password outside the person so whe have  use the same vale not like the example 2
// const { password: hashedPassword } = person;  
// //Predict the output
// console.log(password);
// // console.log(hashedPassword);

// const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
// const [,first] = numbers; //2
// const [,,,second] = numbers; //5
// const [,,,,,,,,third] = numbers; //2
// //Predict the output
// console.log(first == second);
// console.log(first == third);

const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [ ,willThisWork] = secondKey;
//Predict the output
console.log(key); // output String "value"
console.log(secondKey); //the array 
console.log(secondKey[0]); //first index of array
console.log(willThisWork); //secound index of array 

