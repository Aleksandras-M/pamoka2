window.onload = function() {

    let x = prompt("Įveskite skaičių");
    
    if (x == 0) {
        alert("Įvedėte nulį");
    } else if (x % 2 == 0) {
        alert("Skaičius yra lyginis");
    }
    else {
        alert("Skaičius yra nelyginis");
    }

}