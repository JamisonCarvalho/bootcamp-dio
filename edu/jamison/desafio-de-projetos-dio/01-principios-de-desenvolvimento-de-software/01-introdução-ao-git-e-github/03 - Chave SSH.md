# CHAVE SSH

## O que é a chave SSH?
Uma chave SSH é a credencial de acesso para o protocolo de rede SSH (shell seguro). Esse protocolo de rede segura autenticado e criptografado é usado para comunicação remota entre máquinas em rede aberta não segura. O SSH é usado para transferência remota de arquivos, gerenciamento de rede e acesso remoto ao sistema operacional. O acrônimo SSH também é usado para descrever um conjunto de ferramentas usadas para interagir com o protocolo SSH.

O SSH usa um par de chaves para iniciar um aperto de mãos seguro entre partes remotas. O par de chaves contém uma chave pública e privada. A nomenclatura privada versus pública pode ser confusa, pois ambas são chamadas de chaves. É mais útil pensar na chave pública como "fechadura" e na chave privada como a "chave". Você concede o “bloqueio” público a partes remotas para criptografar ou “bloquear” os dados. Esses dados são abertos com a chave “privada” que você mantém em local seguro.

_FONTE_: [Atlassian Bitbucket](https://www.atlassian.com/br/git/tutorials/git-ssh)

### Comandos no GIT BASH para gerar as chaves SSH
1. ssh-keygen -t ed25519 -c “e-mail usado no github”
2. cat nome do arquivo → para visualizar o conteúdo da chave
3. copiar a criptografia da chave e colocar no github
4. eval $(ssh-agent -s) → criar o agente 
5. ssh-add caminho da chave privada
