window.onload = function() {

    let x = prompt("Įveskite skaičių")
    alert(x + " yra didesnis už 100 arba mažesnis už -100: " + arDidesnisArMazesnis(x));
    arDidesnisArMazesnisIsvedimas(x);
}

function arDidesnisArMazesnis(x){
    return x > 100 || x < -100;
}

function arDidesnisArMazesnisIsvedimas(x){
    if (arDidesnisArMazesnis(x) == true) {
        alert(x + " yra didesnis už 100 arba mažesnis už -100");
    } else {
        alert(x + " nera didesnis už 100 arba mažesnis už -100");
    }
}