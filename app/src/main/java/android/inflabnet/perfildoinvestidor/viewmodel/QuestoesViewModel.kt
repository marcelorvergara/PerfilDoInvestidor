package android.inflabnet.perfildoinvestidor.viewmodel

import android.inflabnet.perfildoinvestidor.model.Questoes
import androidx.lifecycle.ViewModel

class QuestoesViewModel : ViewModel() {
    lateinit var questao: List<Questoes>
    var resultado : Int? = 0
    var respostas : MutableMap<String, Int?> = mutableMapOf()

    fun loadQuestoes(): List<Questoes> {

        var allQuestions : List<Questoes> = listOf(
            Questoes(0,"1. Por quanto tempo você pretende deixar seu dinheiro investido?",
                "a Menos de 6 meses",
                "b Entre 6 meses e 1 ano",
                "c Entre 1 ano e 3 anos",
                "d Acima de 3 anos","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 3,"d" to 4,"e" to 0)),

            Questoes(1,"2. Qual o objetivo desse investimento?",
                "a Preservação do capital para não perder valor ao longo do tempo, assumindo baixos riscos de perdas",
                "b Aumento gradual do capital ao longo do tempo, assumindo riscosmoderados",
                "c Aumento do capital acima da taxa de retorno média do mercado, mesmoque isso implique assumir riscos de perdas elevadas",
                "d Obter no curto prazo retornos elevados e signi cativamente acima da taxa de retorno média do mercado, assumindo riscos elevados","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 4,"d" to 5,"e" to 0)),

            Questoes(2,"3. Qual das alternativas melhor classica sua formação e experiência com o mercado financeiro?",
                "a Não possuo formação acadêmica ou conhecimento do mercado fnanceiro",
                "b Possuo formação acadêmica na área  nanceira, mas não tenho experiência com o mercado fnanceiro",
                "c Possuo formação acadêmica em outra área, mas possuo conhecimento do mercado fnanceiro",
                "d Possuo formação acadêmica na área  nanceira ou pleno conhecimento do mercado fnanceiro",
                "vazio",
                gabarito = mapOf ("a" to 0, "b" to 1,"c" to 2,"d" to 4,"e" to 0)),
            
            Questoes(3,"4. Considerando seus rendimentos regulares, qual a porcentagem você pretende reservar para aplicações nanceiras?",
                "a No máximo 25%",
                "b Entre 25,01 e 50%",
                "c Acima de 50%",
                "vazio","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 4,"d" to 4,"e" to 5)),

            Questoes(4,"5. Caso as suas aplicações sofressem uma queda superior a 30%, o que você faria?","a Resgataria toda a aplicação e aplicaria na poupança",
                "b Manteria aplicação aguardando uma melhora do mercado",
                "c Aumentaria a aplicação para aproveitar as oportunidades do mercado","vazio","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 4,"d" to 0,"e" to 0)),

            Questoes(5,"6. Como está distribuído o seu patrimônio?",
                "a Meu patrimônio não está aplicado ou está todo aplicado em renda  xa e/ou imóveis",
                "b Menos de 25% em renda variável e o restante em renda  xa e/ou imóveis",
                "c Entre 25,01 e 50% aplicado em renda variável e o restante em renda fi xa e/ou imóveis",
                "d Acima de 50% em renda variável ","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 3,"d" to 4,"e" to 0)),

            Questoes(6,"7. Em relação as aplicações e rendimentos, em qual dessas situações você se enquadra?",
                "a Conto com o rendimento dessas aplicações para complementar minha renda mensal",
                "b Eventualmente posso resgatar parte das aplicações para fazer frente aos meus gastos. Contudo, não tenho intenção de resgatar no curto prazo e pretendo fazer aplicações regulares",
                "c Não tenho intenção de resgatar no curto prazo, mas não pretendo realizar novas aplicações",
                "d Não tenho intenção de resgatar no curto prazo e ainda pretendo fazer aplicações regulares","vazio",
                gabarito = mapOf ("a" to 0, "b" to 2,"c" to 3,"d" to 4,"e" to 0)),

            Questoes(7,"8. Indique em quais aplicações listadas abaixo você já investiu e qual a frequência nos últimos dois anos. Pode assinalar mais do que uma alternativa. Obs: Efetue a somatória dos pontos referente a questão acima e escolha a alternativa equivalente:",
                "a Entre 0 e 1 ponto",
                "b Entre 2 e 4 pontos",
                "c Acima de 5 pontos","vazio","vazio",
                gabarito = mapOf ("a" to 1, "b" to 2,"c" to 4,"d" to 0,"e" to 0)),

            Questoes(8,"9. Tomando por base as respostas da questão anterior, informar o volume  aproximado que foi destinado a cada operação no período. Obs: Efetue a somatória dos pontos referente a questão acima e escolha a alternativa equivalente:",
                "a 1 ponto",
                "b Entre 2 e 6 pontos",
                "c Acima de 7 pontos","vazio","vazio",
                gabarito = mapOf ("a" to 1, "b" to 2,"c" to 4,"d" to 0,"e" to 0)),

            Questoes(9,"10. Qual sua faixa de renda mensal média?",
                "a Até R\$ 1.000",
                "b De R\$ 1.001 até R\$ 5.000",
                "c De R\$ 5.001 até R\$ 10.000",
                "d Acima de R\$ 10.000","vazio",
                gabarito = mapOf ("a" to 0, "b" to 1,"c" to 2,"d" to 4,"e" to 0)),

            Questoes(10,"11. Qual o valor aproximado do seu patrimônio?",
                "a Até R\$ 10.000",
                "b De R\$ 10.001 até R\$ 100.000",
                "c De R\$ 100.001 até R\$ 500.000",
                "d De R\$ 500.001 até R\$ 1.000.000",
                "e Acima de R\$ 1.000.001",
                gabarito = mapOf ("a" to 0, "b" to 1,"c" to 2,"d" to 4,"e" to 5))
        )
    return allQuestions
    }
}