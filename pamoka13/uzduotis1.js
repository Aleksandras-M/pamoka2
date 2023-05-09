window.onload = function() {

    let x = prompt("Įveskite skaičių kurį norite patikrinti");

    lyginisNelyginis(x);
}

function lyginisNelyginis(x){
    if (x % 2 == 0) {
        alert("Įvestas skaičius yra lyginis");
    } else {
        alert("Įvestas skaičius yra nelyginis");
    }

}