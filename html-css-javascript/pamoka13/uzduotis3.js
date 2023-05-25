window.onload = function() {

    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("Įveskite antrą skaičių")

    didesnisMazesnisVienodiIsvedimas(x, y);

}

function didesnisMazesnisVienodi(x, y) {
    if (x == y) {
        return 0;
    } else if (x < y){
        return 1;
    }
    else {
        return -1;
    }
}

function didesnisMazesnisVienodiIsvedimas(x, y) {

    if (didesnisMazesnisVienodi(x, y) == 0) {
        alert("įvesti skaičiai yra lygus");
    } else if (didesnisMazesnisVienodi(x, y) == 1){
        alert("Antras įvestas skaičius didesnis už pirmą įvestą skaičių");
    }
    else {
        alert("Pirmas įvestas skaičius didesnis už antrą įvestą skaičių");
    }
}