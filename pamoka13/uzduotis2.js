window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    
    alert(lyginisNelyginis(x));

}

function lyginisNelyginis(x) {
    if (x == 0) {
        return "Įvedėte nulį";
    } else if (x % 2 == 0) {
        return "Skaičius yra lyginis";
    }
    else {
        return "Skaičius yra nelyginis";
    }
}