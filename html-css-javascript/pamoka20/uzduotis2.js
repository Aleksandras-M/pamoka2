window.onload = function () {

    let pastraipa = document.getElementById("pastraipa");
    let mygtukas1 = document.getElementById("mygtukas1");
    let mygtukas2 = document.getElementById("mygtukas2");
    let mygtukas3 = document.getElementById("mygtukas3");
    let mygtukas4 = document.getElementById("mygtukas4");
    let mygtukas5 = document.getElementById("mygtukas5");
    let mygtukas6 = document.getElementById("mygtukas6");
    console.log(mygtukas1);
    console.log(mygtukas2);
    console.log(mygtukas3);
    console.log(mygtukas4);
    console.log(mygtukas5);
    console.log(mygtukas6);

    mygtukas1.onclick = function () {
        pastraipa.innerHTML = `Javascript programavimas`;
    }

    mygtukas2.onclick = function () {
        alert(`Svarbus pranešimas`);
    }

    mygtukas3.onclick = function () {
        pastraipa.innerHTML = prompt(`Įveskite tekstą`);
    }

    mygtukas4.onclick = function () {
        pastraipa.style.backgroundColor = "tomato";
    }

    mygtukas5.onclick = function () {
        pastraipa.style.display = "none";
    }

    mygtukas6.onclick = function () {
        let raide = prompt(`Įveskite raidę kurios ieškoti`);
        suskaiciuotiRaides(pastraipa.innerHTML, raide);
        alert(`Pastraipoje yra ${suskaiciuotiRaides(pastraipa.innerHTML, raide)} ${raide} `)
    }
}

function suskaiciuotiRaides(tekstas, raide) {
    let count = 0;
    for (let i = 0; i < tekstas.length; i++) {
        tekstas[i].toLocaleLowerCase() === raide.toLocaleLowerCase() ? count += 1 : count += 0 ;
    }
    return count;
}