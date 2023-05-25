window.onload = function() {

    let a = +prompt("Įveskite pirmą skaičių");
    let b = +prompt("Įveskite antrą skaičių");
    let c = +prompt("Įveskite trečią skaičių");

    didziausiasSkaiciusIsvedimas(a, b, c);

}

function didziausiasSkaicius(a, b, c){
    if (a > b && a > c) {
        return a;
    } else if (b > a && b > c){
        return b;
    } else {
        return c;
    }
}

function didziausiasSkaiciusIsvedimas(a, b, c){
    if (didziausiasSkaicius(a, b, c) == a) {
        alert("Didžiausias skačius iš " + a + ", " + b + " ir " + c + " yra " + a);
    } else if (didziausiasSkaicius(a, b, c) == b){
        alert("Didžiausias skačius iš " + a + ", " + b + " ir " + c + " yra " + b);
    } else {
        alert("Didžiausias skačius iš " + a + ", " + b + " ir " + c + " yra " + c);
    }
}