window.onload = function(){

    let forma = document.forms["forma"];
    let pirmasSkaiciusIvedimas = forma["pirmasSkaicius"];
    let antrasSkaiciusIvedimas = forma["antrasSkaicius"];
    let mygtukas1 = document.getElementById("mygtukas1");
    let mygtukas2 = document.getElementById("mygtukas2");
    let mygtukas3 = document.getElementById("mygtukas3");
    let mygtukas4 = document.getElementById("mygtukas4");
    let tekstas = document.getElementById("tekstas");
    

    mygtukas1.onclick = function() {
        let x = pirmasSkaiciusIvedimas.valueAsNumber;
        let y = antrasSkaiciusIvedimas.valueAsNumber;
        let suma = x + y;
        // alert(`${x} + ${y} yra ${suma}`);
        tekstas.innerHTML = `${x} + ${y} yra ${suma}`;
    }

    mygtukas2.onclick = function() {
        let x = pirmasSkaiciusIvedimas.valueAsNumber;
        let y = antrasSkaiciusIvedimas.valueAsNumber;
        let atimtis = x - y;
        // alert(` ${x} - ${y} yra ${atimtis}`);
        tekstas.innerHTML = ` ${x} - ${y} yra ${atimtis}`;
    }

    mygtukas3.onclick = function() {
        let x = pirmasSkaiciusIvedimas.valueAsNumber;
        let y = antrasSkaiciusIvedimas.valueAsNumber;
        let daugyba = x * y;
        // alert(`${x} * ${y} yra ${daugyba}`);
        tekstas.innerHTML = `${x} + ${y} yra ${suma}`;
    }

    mygtukas4.onclick = function() {
        let x = pirmasSkaiciusIvedimas.valueAsNumber;
        let y = antrasSkaiciusIvedimas.valueAsNumber;
        if (y == 0) {
            // alert(`Dalyba iš nulio negalima`);
            tekstas.innerHTML = `Dalyba iš nulio negalima`;
        } else {
            let dalyba = x / y;
            // alert(`${x} / ${y} yra ${dalyba.toFixed(5)}`);
            tekstas.innerHTML = `${x} / ${y} yra ${dalyba.toFixed(10)}`;
        }      
    }
}