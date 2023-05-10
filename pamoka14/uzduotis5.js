window.onload = function() {

    let a = +prompt("Įveskite pirmos kraštinės ilgį");
    let b = +prompt("Įveskite antros kraštinės ilgį");
    let c = +prompt("Įveskite trečios kraštinės ilgį");

    trikampioTikrinimas(a, b, c);
}

function trikampioTikrinimas(a, b, c) {
    if (a == b && b == c && a == c) {
        alert("trikampis yra lygiakraštis");
    } else if(a == b || b == c || a == c){
        alert("trikampis yra lygiašonis");
    }
    else {
        alert("trikampis yra paprastas");
    }
}