const bnt_form = document.querySelector("#send")


let url_do_aluno;
    bnt_form.addEventListener("click",async function(e){
    e.preventDefault()
    
    let limpa_registro_aluno = document.querySelector("span")
    if(limpa_registro_aluno!=null){
        limpa_registro_aluno.remove();
    }

    let numero = document.querySelector("#aluno_id")
    let id_passado =  numero.value
    url_do_aluno = "http://localhost:8080/alunos/" + id_passado
    aluno_pos()
    setTimeout(() => {inseri_aluno(aluno)},750)
})
  
async function aluno_pos(){
   let aln = await fetch(url_do_aluno)
   .then(aln => aln.json())
   .then(aln => aluno = aln)
   .catch(aln => aluno = {id: "--" , nome: "Registro inexistente" , email: "--" , ciclo: "--" , idade: "--"})
}

let aluno;

    function inseri_aluno(obj){
    let apresenta = document.querySelector("#formulario")
    let insercao = document.createElement("span")
    insercao.className = "linha"
    apresenta.insertAdjacentElement("afterbegin",insercao)
        insercao.innerHTML = "ID: " + obj.id + " Nome: " + obj.nome + " Email: " + obj.email + " Ciclo: " + obj.ciclo + " Idade: " + obj.idade 
}


