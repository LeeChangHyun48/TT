package com.tt9ood.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class PlayerCharInfo {
    // 자동 생성되는 pk
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "py_char_code")
    private Long playerCode;
    // 플레이어 캐릭터 유저 코드
    @Column(name = "py_code")
    private Long playerUserCode;
    // 플레이어 캐릭터 종족
    @Column(name = "py_species")
    private String playerSpecies;
    // 플레이어 캐릭터 이름
    @Column(name = "py_name")
    private String playerName;
    // 플레이어 캐릭터 외모
    @Column(name = "py_look")
    private String playerLook;
    // 플레이어 캐릭터 가치관
    @Column(name = "py_value")
    private String playerValue;
    // 플레이어 캐릭터 무기
    @Column(name = "py_weapon")
    private String playerWeapon;
    // 플레이어 캐릭터 갑옷
    @Column(name = "py_armor")
    private String playerArmor;
    // 플레이어 캐릭터 현재 HP
    @Column(name = "py_curr_hp")
    private Long playerHP;
    // 플레이어 캐릭터 소모품1(붕대)
    @Column(name = "py_sup_one")
    private Long playerSup1;
    // 플레이어 캐릭터 소모품2(치료약)
    @Column(name = "py_sup_two")
    private Long playerSup2;
    // 플레이어 캐릭터 소모품3(해독제)
    @Column(name = "py_sup_three")
    private Long playerSup3;
    // 플레이어 캐릭터 스탯1
    @Column(name="py_stat_one")
    private Long playerStat1;
    // 플레이어 캐릭터 스탯2
    @Column(name="py_stat_two")
    private Long playerStat2;
    // 플레이어 캐릭터 스탯3
    @Column(name="py_stat_three")
    private Long playerStat3;
    // 플레이어 캐릭터 스탯4
    @Column(name="py_stat_four")
    private Long playerStat4;
    // 플레이어 캐릭터 스탯5
    @Column(name="py_stat_five")
    private Long playerStat5;
    // 플레이어 캐릭터 스탯6
    @Column(name="py_stat_six")
    private Long playerStat6;
    // 플레이어 캐릭터 직업
    @Column(name="py_class")
    private String playerClassName;
    // 플레이어 캐릭터 스킬1
    @Column(name="py_skill_one")
    private String playerSkill1;
    // 플레이어 캐릭터 스킬2
    @Column(name="py_skill_two")
    private String playerSkill2;
    // 플레이어 캐릭터 스킬3
    @Column(name="py_skill_three")
    private String playerSkill3;

    public PlayerCharInfo(Long playerCode, Long playerUserCode, String playerSpecies, String playerName, String playerLook, String playerValue, String playerWeapon, String playerArmor, Long playerHP, Long playerSup1, Long playerSup2, Long playerSup3, Long playerStat1, Long playerStat2, Long playerStat3, Long playerStat4, Long playerStat5, Long playerStat6, String playerClassName, String playerSkill1, String playerSkill2, String playerSkill3) {
        this.playerCode = playerCode;
        this.playerUserCode = playerUserCode;
        this.playerSpecies = playerSpecies;
        this.playerName = playerName;
        this.playerLook = playerLook;
        this.playerValue = playerValue;
        this.playerWeapon = playerWeapon;
        this.playerArmor = playerArmor;
        this.playerHP = playerHP;
        this.playerSup1 = playerSup1;
        this.playerSup2 = playerSup2;
        this.playerSup3 = playerSup3;
        this.playerStat1 = playerStat1;
        this.playerStat2 = playerStat2;
        this.playerStat3 = playerStat3;
        this.playerStat4 = playerStat4;
        this.playerStat5 = playerStat5;
        this.playerStat6 = playerStat6;
        this.playerClassName = playerClassName;
        this.playerSkill1 = playerSkill1;
        this.playerSkill2 = playerSkill2;
        this.playerSkill3 = playerSkill3;
    }

    /**
     * 플레이어캐릭터 정보 수정
     */
    public void updatePlayerCharInfo(Long playerUserCode, String playerSpecies, String playerName, String playerLook, String playerValue, String playerWeapon, String playerArmor, Long playerHP, Long playerSup1, Long playerSup2, Long playerSup3, Long playerStat1, Long playerStat2, Long playerStat3, Long playerStat4, Long playerStat5, Long playerStat6, String playerClassName, String playerSkill1, String playerSkill2, String playerSkill3) {
        this.playerUserCode = playerUserCode;
        this.playerSpecies = playerSpecies;
        this.playerName = playerName;
        this.playerLook = playerLook;
        this.playerValue = playerValue;
        this.playerWeapon = playerWeapon;
        this.playerArmor = playerArmor;
        this.playerHP = playerHP;
        this.playerSup1 = playerSup1;
        this.playerSup2 = playerSup2;
        this.playerSup3 = playerSup3;
        this.playerStat1 = playerStat1;
        this.playerStat2 = playerStat2;
        this.playerStat3 = playerStat3;
        this.playerStat4 = playerStat4;
        this.playerStat5 = playerStat5;
        this.playerStat6 = playerStat6;
        this.playerClassName = playerClassName;
        this.playerSkill1 = playerSkill1;
        this.playerSkill2 = playerSkill2;
        this.playerSkill3 = playerSkill3;
    }
}
