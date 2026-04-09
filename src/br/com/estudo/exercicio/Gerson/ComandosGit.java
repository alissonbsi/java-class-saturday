package br.com.estudo.exercicio.Gerson;

public class ComandosGit {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println("Soma: " + (a * b * c));
    }
}
//----------------- Guia simples do git ----------------
//1. Verificar o que foi feito
// (git status): Para verificar os arquivos novos ou modificados

//2:Selecionar os arquivos
// (git add NomeDoArquivo.java): Para adicionar um arquivo específico (git add .):Para adicionar tudo de uma vez

//3: Criar a versão
// (git commit -m) "Explique aqui o que você fez no código". Aqui você dá um nome e uma descrição para o que fez. Isso salva a versão no seu computador.

//4. Enviar para a nuvem
// (git push origin nome-da-sua-branch) empurra o seu commit local para o servidor remoto.


//git checkout develop      # Muda para a sua develop local
//git pull origin develop   # Atualiza ela com o que tem no servidor
//git merge feature-login   # Une sua tarefa à develop
//git push origin develop   # Envia tudo pronto para o servidor