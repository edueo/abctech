# Case da ABC TechService

A ABC TechService é uma empresa que presta serviços para diferentes empresas dos ramos de telecomunicações, elétrica ou manutenções de linha branca, como geladeiras, fogões e máquinas de lavar.

Alguns problemas reportados por clientes finais e pelas empresas parceiras estão gerando prejuízos e riscos operacionais que podem levar a quebra de contratos.

Com isso, as áreas de TI e CS (sucesso do cliente ou customer success) levantaram os possíveis causadores dos problemas, e pontos abaixo foram os que mais apareceram nas pesquisas realizadas:
• Aplicativo não captura informação de geolocalização ao início e término de serviço, possibilitando que o prestador não compareça para prestação do serviço.
• Reclamação dos prestadores, aplicativo lento e que descarrega o celular rapidamente. Com isso, muitos ainda acabam utilizando fichas e recibos físicos.
• É complexo para adicionar os serviços realizados e a ordem.
• O sistema não gera relatório do tempo gasto para realização do serviço.
• Ao finalizar, o serviço não exige nenhuma confirmação do cliente.

Com esses pontos levantados e urgência para a resolução, a diretoria da ABC TechService optou e liberou orçamento para a criação de um novo sistema e aplicativo que ficará em posse do prestador durante os atendimentos. E, com isso, foi solicitado para sua empresa um novo sistema MVP que será testado durante quatro semanas, com as seguintes funcionalidades:
• Sistema deve ser rápido e escalável.
• O aplicativo deve funcionar em Android, iOS e Web.
• O aplicativo identificará o prestador por um código numérico.
• O aplicativo deverá contar com uma lista de serviços prestados.
• Cada ordem deverá ter ao menos 1 serviço prestado e poderá ter até 15 serviços realizados.
• O aplicativo deverá gravar a hora e geolocalização ao iniciar o atendimento.
• O aplicativo deverá gravar a hora e geolocalização ao finalizar o atendimento.
• Ao finalizar, todas essas informações devem ser enviadas para o servidor e gravadas em um banco de dados.

## DESAFIO

Vamos começar pela construção do nosso microsserviço em Java com Springboot, garantir que o nosso código siga uma estrutura que possibilite a criação de testes unitários para uma entrega com maior qualidade.
Com nosso microsserviço pronto, vamos desenvolver o aplicativo e, como precisamos que ele esteja disponível nas plataformas Android, iOS e Web, escolhemos desenvolver com o Framework Flutter.
Por fim, vamos publicar nosso microsserviço em uma cloud pública utilizando técnicas de CI/CD, facilitando desenvolvimentos e publicações futuras.

## LIVES e MENTORIAMENTO

Nossa POC será progressivamente construída live a live. É importante que você participe das aulas ao vivo com o seu grupo. Assim, durante o Hands On, organizados em Breakouts Rooms, poderão receber todo o suporte necessário para o desenvolvimento da solução que será composta pelas seguintes etapas:
• Cloud AWS CI/CD – Live: Preparação da infraestrutura e do CI/CD.
• Springboot microsserviço – Live: Começando nosso microsserviço em Java com Springboot e teste unitários.
• Springboot microsserviço – Live: Continuando o desenvolvimento de nosso microsserviço em Java com Springboot e fazendo o deploy.
• Flutter – Framework multiplataforma – Live: Configuração do ambiente e inicialização do nosso app também com teste unitário.
• Flutter – Framework multiplataforma – Live: Finalizando o aplicativo e gerando as versões.

## ENTREGÁVEL:

Ao final, você deverá entregar:
• Apresentação com quais requisitos serão desenvolvidos na POC do aplicativo (lembrando que, na live, desenvolveremos todos os requisitos).
• Print do pipeline executado no CI/CD da aplicação.
• O código de backend desenvolvido em Springboot com os testes unitários em ao menos 30% das features.
• O código front-end desenvolvido em Flutter/Dart com os requisitos descritos na apresentação.
