window.onload = function() {

    let x = prompt("Įveskite skaičių kurį norite patikrinti");

    lyginisNelyginisisvedimas(x);
}

function lyginisNelyginis(x){
    if (x % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

function lyginisNelyginisIsvedimas(x){
    if (lyginisNelyginis(x) == true) {
        alert("Įvestas skaičius yra lyginis");
    } else {
        alert("Įvestas skaičius yra nelyginis");
    }
}