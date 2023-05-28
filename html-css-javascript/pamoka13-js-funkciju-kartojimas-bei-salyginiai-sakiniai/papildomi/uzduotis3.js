window.onload = function () {

    let x = +prompt("Įveskite pirmąjį skaičių");
    let y = +prompt("Įveskite antrąjį skaičių");

    daugiauMaziau(x, y);
}

function daugiauMaziau(x){
    if (x > y) {
        alert("-1");
    } else if (x < y) { 
        alert("1");
    }
    else {
        alert("0");
    }
}