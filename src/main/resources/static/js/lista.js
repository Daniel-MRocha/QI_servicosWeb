let url_backend_listagem = "http://localhost:8080/alunos";
let alunos = new Array();

let conteudo = document.querySelector("#conteudo_lista")



async function listagem(){
let lista_promessa = fetch(url_backend_listagem);

return await lista_promessa
.then(lst => {return lst.json()})
.then(valor => {
    [...valor].forEach(elem => {
        alunos.push(aluno_construtor(elem))
    });
})

}

function aluno_construtor(obj){
    return aluno_obj(obj.id, obj.nome, obj.email,obj.ciclo, obj.idade)
}

function aluno_obj(_id , _nome , _email , _ciclo , _idade){
    return {
        id : _id ,
        nome : _nome ,
        email : _email , 
        ciclo : _ciclo ,
        idade : _idade
    }
}

//busca listagem do backend
listagem();

function monta_registro_html(obj){
    let linha = document.createElement("div")
    linha.className = "linha"
    linha.innerHTML = "ID: "+ obj.id + "  Nome: " + obj.nome + "  Email: " + obj.email + "  Ciclo: " + obj.ciclo + "  Idade: " + obj.idade
    conteudo.insertAdjacentElement("afterbegin",linha)
}

async function insere_conteudo(obj){
    for(ele of obj){
        monta_registro_html(ele)
    }

}

()=> setTimeout(alert('ola'),2000)

