package duel;

import java.util.ArrayList;

public abstract class Hero
{
    public int gj = 63, fy = 63, xl = 223, zhiye = 0; // ���� ���� Ѫ��

    public int type = 0;// 1 zhanshi, 2 fashi

    public String name = "p1";
    
    public ArrayList<Buff> buffList = new ArrayList<Buff>();
    public ArrayList<Skill> skillList = new ArrayList<Skill>();
    public int qili;
    // public abstract void sk1();
    // public abstract void sk2();
    // public abstract void sk3();
    // public abstract void sk4();
    // public abstract void sk5();
    // public abstract int sk6();
    // public abstract void sk7();
    // public abstract void sk8();
    // public abstract void skQ();
    // public abstract void skW();
    // public abstract void skE();
    // jineng1
    // jineng2
    // jineng3
    // jineng4

    public Hero()
    {
        
    }

    public abstract void initSkill(Hero p, CreateHero c);
    
}
