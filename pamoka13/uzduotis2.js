window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    
    lyginisNelyginis(x);

}

function lyginisNelyginis(x) {
    if (x == 0) {
        alert("Įvedėte nulį");
    } else if (x % 2 == 0) {
        alert("Skaičius yra lyginis");
    }
    else {
        alert("Skaičius yra nelyginis");
    }
}