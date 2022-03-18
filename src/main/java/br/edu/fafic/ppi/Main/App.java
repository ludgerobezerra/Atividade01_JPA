package br.edu.fafic.ppi.Main;

import br.edu.fafic.ppi.dao.CampeonatoDao;
import br.edu.fafic.ppi.dao.JogadorDao;
import br.edu.fafic.ppi.dao.TecnicoDao;
import br.edu.fafic.ppi.dao.EquipeDao;
import br.edu.fafic.ppi.domain.*;

import java.util.Arrays;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();

        jogador1.setNome("Ludgero");
        jogador1.setPosicao("Goleiro");
        jogador1.setStatus("Titular");


        Jogador jogador2 = new Jogador();
        jogador2.setNome("klelver");
        jogador2.setPosicao("Atacante");
        jogador2.setStatus("Titular");


        Jogador jogador3 = new Jogador();
        jogador3.setNome("Luciano");
        jogador3.setPosicao("Meio de Campo");
        jogador3.setStatus("reserva");

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Taylson");

        Equipe equipe = new Equipe();
        equipe.setNome("Unidos pela amizade");

        Equipe equipe2 = new Equipe();
        equipe2.setNome("Devs");

        Campeonato campeonato = new Campeonato();
        campeonato.setNome("Para TI");

        JogadorDao jogadorDao = new JogadorDao();
//        jogadorDao.saveOrUpdate(jogador1);
//        jogadorDao.saveOrUpdate(jogador2);
//        jogadorDao.saveOrUpdate(jogador3);

        TecnicoDao tecnicoDao = new TecnicoDao();
//        tecnicoDao.saveOrUpdate(tecnico);

        EquipeDao equipeDao =  new EquipeDao();
//        equipeDao.saveOrUpdate(equipe2);

        CampeonatoDao campeonatoDao = new CampeonatoDao();
//        campeonatoDao.saveOrUpdate(campeonato);

        //Buscar Time do Jogador pelo nome do jogador
//        String equipeTecnico = equipeDao.findByString("timeByJogador", "Luciano");
//        System.out.println(equipeTecnico);

        //Buscar Jogador pelo Status
//        List<Equipe> equipeStatus = equipeDao.findListBy("jogadorByStatus", "reserva");
//        System.out.println(equipeStatus);

        //Buacar equipes de um campeonato
       // List<Equipe> equipesDoCampeonato = equipeDao.findListBy("equipesByCampeonato","Para TI");
        //System.out.println(equipesDoCampeonato);

        //Buscar equipe pelo nome do tecnico
        String tecnicoDaEquipe = tecnicoDao.findByString("equipeByTecnico","Taylson");
        System.out.println(tecnicoDaEquipe);

        //Buscar jogador pelo nome da Equipe
        List<Jogador> jogadores = jogadorDao.findListBy("jogadorByEquipe",tecnicoDaEquipe);
        System.out.println(jogadores);

//        tecnicoDaEquipe.setEquipe(equipeTecnico);
//        tecnicoDao.saveOrUpdate(tecnicoDaEquipe);
//
//        equipeTecnico.setTecnico(tecnicoDaEquipe);
//        equipeDao.saveOrUpdate(equipeTecnico);

        //Buscar Tecnico pelo nome da equipe
//        Equipe equipeTecnico =  equipeDao.findByName("tecnicoByEquipe", "Unidos pela amizade");
//       System.out.println(equipeTecnico.getTecnico().getNome());

        //Buscar todos os jogadores
//        List<Jogador> jogadores = jogadorDao.findAll("jogadores");
////        System.out.println(jogadores);

//        equipeTecnico.setJogadores(jogadores);
//        equipeDao.saveOrUpdate(equipeTecnico);
//        jogadores.forEach(jogador -> {
//            jogador.setEquipe(equipeTecnico);
//            jogadorDao.saveOrUpdate(jogador);
//        });

//        Campeonato campeonatoEquipe = campeonatoDao.findByName("campeonato", "Para TI");
//        //System.out.println(campeonatoEquipe);
//        campeonatoEquipe.setEquipe(Arrays.asList(equipeTecnico));
//        campeonatoDao.saveOrUpdate(campeonatoEquipe);
//
//        equipeTecnico.setCampeonato(campeonatoEquipe);
//        equipeDao.saveOrUpdate(equipeTecnico);


    }

}
