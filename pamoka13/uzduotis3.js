window.onload = function() {

    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("Įveskite antrą skaičių")

    didesnisMazesnisVienodi(x, y);

}

function didesnisMazesnisVienodi(x, y) {

    if (x == y) {
        alert("įvesti skaičiai yra lygus");
    } else if (x < y){
        alert("Antras įvestas skaičius didesnis už pirmą įvestą skaičių");
    }
    else {
        alert("Pirmas įvestas skaičius didesnis už antrą įvestą skaičių");
    }
}