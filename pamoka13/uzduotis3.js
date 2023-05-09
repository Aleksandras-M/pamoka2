window.onload = function () {

    let x = +prompt("Įveskite pirmąjį skaičių");
    let y = +prompt("Įveskite antrąjį skaičių");

    alert(daugiauMaziau(x, y));
}

function daugiauMaziau(x, y){
    if (x > y) {
        return "-1";
    } else if (x < y) { 
        return "1";
    }
    else {
        return "0";
    }
}