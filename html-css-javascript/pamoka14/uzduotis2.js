window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    alert("Ar įvestas skaičius yra teigiamas ir lyginis: " + arSkaiciusLyginisIrTeigiamas(x));

    arSkaiciusLyginisIrTeigiamasIsvedimas(x)
}

function arSkaiciusLyginisIrTeigiamas(x) {
    return x % 2 == 0 && x >= 0;
}

function arSkaiciusLyginisIrTeigiamasIsvedimas(x) {
    if (arSkaiciusLyginisIrTeigiamas(x) == true) {
        alert(x + " yra lyginis ir teigiamas")
    } else {
        alert(x + " nėra lyginis ir teigiamas")
    }
}