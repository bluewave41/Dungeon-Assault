import java.util.Random;

final class bl_ {
   String _f;
   String _g;
   int _m;
   static int[] _n = new int[]{6, 11, 12, 13, 7};
   static boolean _k;
   static cn_ _j;
   static Random _i = new Random();
   nh_ _q;
   String _h;
   static String _b = "<col=FF0000>Free players are limited to a maximum of 5 Orbs of this type.<%0></col>";
   static cn_[] _d;
   static cn_ _s;
   static int _p;
   static cn_ _o;
   static rj_ _l;
   static cn_ _e;
   static int _c = 0;
   static je_ _r;
   static String _a = "Next";
   static nh_ _t;

   public static void d423() {
      _o = null;
      _b = null;
      _s = null;
      _n = null;
      _i = null;
      _e = null;
      _r = null;
      _a = null;
      _t = null;
      _j = null;
      _d = null;
      _l = null;
   }

   static final void c423() {
      kk_._l = ah_.a770(np_._A, 200, "smallfont", "", hj_._Z);
      db_._v = ah_.a770(np_._A, 200, "roman12bold", "", hj_._Z);
      df_._c = rc_.a324("", sb_._a, "main_center");
      dm_._d = new cn_[3];
      qi_._f = new cn_[3];

      int var0;
      for(var0 = 0; var0 < 3; ++var0) {
         dm_._d[var0] = rc_.a324("", sb_._a, "main_left_0" + (var0 + 1));
      }

      for(var0 = 0; var0 < 3; ++var0) {
         qi_._f[var0] = rc_.a324("", sb_._a, "main_right_0" + (var0 + 1));
      }

      tm_._p = oh_.a825(hj_._Z, "", "menu_block");
      of_._j = oh_.a825(hj_._Z, "", "menu_button");
      le_._f = oh_.a825(hj_._Z, "", "menu_moss_top_left");
      e_._j = oh_.a825(hj_._Z, "", "menu_moss_top_right");
      wj_._w = oh_.a825(hj_._Z, "", "menu_moss_1");
      oj_._a = oh_.a825(hj_._Z, "", "menu_moss_2");
      oh_.a825(hj_._Z, "", "menu_moss_bottom");
      am_._a = oh_.a825(hj_._Z, "", "menu_chain_frame");
      lf_._x = oh_.a825(hj_._Z, "", "menu_chain_ext");
      lf_._n = oh_.a825(hj_._Z, "", "menu_chain_line");
      hf_._Ab = oh_.a825(hj_._Z, "", "menu_chain");
      kh_._m = kn_.a922(hj_._Z, "", "cursor");
      jg_._c = new cn_[kh_._m.length];

      for(var0 = 0; kh_._m.length > var0; ++var0) {
         jg_._c[var0] = rb_.a551(8, kh_._m[var0], 16711680, (byte)124);
      }

      bf_._d = oh_.a825(hj_._Z, "", "smoke");
      bo_._Kb = oh_.a825(hj_._Z, "", "scrollbar_top");
      ud_._y = oh_.a825(hj_._Z, "", "scrollbar_bottom");
      qh_._q = oh_.a825(hj_._Z, "", "scrollbar_slider");
      tn_._W = bo_._Kb.d125();
      tn_._W.f797();
      dc_._x = ud_._y.d125();
      dc_._x.f797();
      ml_._a = qh_._q.d125();
      ml_._a.f797();
      hm_._q = dd_.a510(4, bo_._Kb);
      qf_._f = dd_.a510(4, ud_._y);
      ji_._G = dd_.a510(4, qh_._q);
      _o = dd_.a510(4, tn_._W);
      go_._S = dd_.a510(4, dc_._x);
      im_._m = dd_.a510(4, ml_._a);
      cn_ var17 = oh_.a825(hj_._Z, "", "cracked_bar");
      cn_ var1 = var17.d125();
      var1.g797();
      cn_ var2 = oh_.a825(hj_._Z, "", "cracked_bar_endcap");
      cn_ var3 = var2.d125();
      var3.g797();
      ad_._e = ph_.a343(hj_._Z, "", "interface_crescent");
      oe_._m = ph_.a343(hj_._Z, "", "interface_dragon");
      pi_._b = oh_.a825(hj_._Z, "", "interface_lattice");
      jm_._i = oh_.a825(hj_._Z, "", "button_152");
      oh_.a825(hj_._Z, "", "button_252");
      gh_._g = kn_.a922(hj_._Z, "", "strategy_buttons");
      jh_.c797();
      int var4 = var17._y;
      int var5 = var17._v;

      for(int var6 = 0; var4 * var5 > var6; ++var6) {
         var17._B[var6] = mp_.a080(var17._B[var6], Integer.MIN_VALUE);
      }

      cn_ var18 = new cn_(var4, var5);
      var18.e797();
      gf_.b050(0, 0, var4, 2, 16416);
      gf_.b050(0, 2, var4, var5 - 4, 96);
      gf_.b050(0, var5 - 2, var4, 2, 49184);
      bk_._e = new ph_(var17, var18);
      var4 = var1._y;
      var5 = var1._v;

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1._B[var7] = mp_.a080(var1._B[var7], Integer.MIN_VALUE);
      }

      cn_ var19 = new cn_(var4, var5);
      var19.e797();
      gf_.b050(0, 0, 2, var5, 4194336);
      gf_.b050(2, 0, var4 - 4, var5, 96);
      gf_.b050(var4 - 2, 0, 2, var5, 12582944);
      be_._o = new ph_(var1, var19);
      var5 = var2._v;
      var4 = var2._y;

      for(int var8 = 0; var5 * var4 > var8; ++var8) {
         var2._B[var8] = mp_.a080(var2._B[var8], Integer.MIN_VALUE);
      }

      cn_ var20 = new cn_(var4, var5);
      var20.e797();
      gf_.b050(0, 0, var4, 2, 16416);
      gf_.b050(0, 2, var4, var5 - 4, 96);
      gf_.b050(0, var5 - 2, var4, 2, 49184);

      int var9;
      for(var9 = 0; var9 < var4 * var5; ++var9) {
         if (var2._B[var9] == Integer.MIN_VALUE) {
            var2._B[var9] = 0;
            var20._B[var9] = 0;
         }
      }

      wh_._g = new ph_(var2, var20);
      var5 = var3._v;
      var4 = var3._y;

      for(var9 = 0; var9 < var5 * var4; ++var9) {
         var3._B[var9] = mp_.a080(var3._B[var9], Integer.MIN_VALUE);
      }

      cn_ var21 = new cn_(var4, var5);
      var21.e797();
      gf_.b050(0, 0, 2, var5, 4194336);
      gf_.b050(2, 0, var4 - 4, var5, 96);
      gf_.b050(var4 - 2, 0, 2, var5, 12582944);

      for(int var10 = 0; var10 < var5 * var4; ++var10) {
         if (Integer.MIN_VALUE == var3._B[var10]) {
            var3._B[var10] = 0;
            var21._B[var10] = 0;
         }
      }

      ac_._w = new ph_(var3, var21);
      ec_._j = qa_.a466("achievements_large", "", hj_._Z);
      md_.a238(97, f_._a);
      md_.a238(98, lb_._o);
      cf_._f = new cn_(32, 32);
      cf_._f.e797();
      lb_._o.a115(0, 0, 32, 32);
      jh_.b797();
      lb_._o = null;
      nb_._d = oh_.a825(hj_._Z, "", "base");
      cn_[] var22 = kn_.a922(hj_._Z, "", "room_icons");
      ja_._b = kn_.a922(hj_._Z, "", "room_icons_2d");
      _d = kn_.a922(hj_._Z, "", "wall_icons_2d");
      ri_._d = kn_.a922(hj_._Z, "", "walls");
      mc_._w = kn_.a922(hj_._Z, "", "room_floors");
      cn_[] var11 = mc_._w;

      int var12;
      cn_ var13;
      for(var12 = 0; var12 < var11.length; ++var12) {
         var13 = var11[var12];
         var13._A = 18;
      }

      i_._r = wk_.a528(var22, 0);
      cn_ var23 = oh_.a825(hj_._Z, "", "room_monster");

      for(var12 = 0; var12 < 38; ++var12) {
         if (null != gh_._i[var12] && gh_._i[var12]._g == 2) {
            i_._r[var12] = var23;
         }
      }

      i_._r[0] = mc_._w[0];
      i_._r[2] = oh_.a825(hj_._Z, "", "room_gold");
      i_._r[4] = oh_.a825(hj_._Z, "", "room_pit");
      i_._r[5] = oh_.a825(hj_._Z, "", "room_snakes");
      i_._r[6] = oh_.a825(hj_._Z, "", "room_nails");
      i_._r[7] = oh_.a825(hj_._Z, "", "room_hiddenpit");
      i_._r[8] = oh_.a825(hj_._Z, "", "room_teleport");
      i_._r[9] = oh_.a825(hj_._Z, "", "room_hiddennails");
      i_._r[10] = oh_.a825(hj_._Z, "", "room_pit");
      i_._r[11] = oh_.a825(hj_._Z, "", "room_crusher");
      i_._r[12] = oh_.a825(hj_._Z, "", "room_crossbow");
      i_._r[14] = oh_.a825(hj_._Z, "", "room_gas");
      i_._r[36] = oh_.a825(hj_._Z, "", "room_hallofglass");
      sn_._c = kn_.a922(hj_._Z, "", "torches");
      rg_.i150();
      mf_._b = kn_.a922(hj_._Z, "", "doormasks");
      jh_.c797();
      ua_._b = new ph_[6];

      int var14;
      for(var12 = 0; var12 < 6; ++var12) {
         var13 = ri_._d[var12];

         for(var14 = 0; var13._B.length > var14; ++var14) {
            if (var13._B[var14] != 0) {
               var13._B[var14] = mp_.a080(var13._B[var14], Integer.MIN_VALUE);
            }
         }

         cn_ var27 = new cn_(var13._y, var13._v);
         var27.e797();
         var13.e326(0, 0, (1 & var12) == 0 ? 3199008 : 13684768);
         ua_._b[var12] = new ph_(var13, var27);
      }

      jh_.b797();
      jc_._c = oh_.a825(hj_._Z, "pieces", "piece_baeserker");
      f_._f = oh_.a825(hj_._Z, "pieces", "piece_banshee");
      qm_._m = oh_.a825(hj_._Z, "pieces", "piece_bat");
      ia_._R = oh_.a825(hj_._Z, "pieces", "piece_beastman");
      ld_._d = oh_.a825(hj_._Z, "pieces", "piece_blackknight");
      ck_._G = oh_.a825(hj_._Z, "pieces", "piece_blade_construct");
      ll_._q = oh_.a825(hj_._Z, "pieces", "piece_darkelf");
      lb_._v = oh_.a825(hj_._Z, "pieces", "piece_demon");
      fp_._b = oh_.a825(hj_._Z, "pieces", "piece_dryhad");
      bj_._F = oh_.a825(hj_._Z, "pieces", "piece_dwarf");
      ie_._i = oh_.a825(hj_._Z, "pieces", "piece_enchantress");
      hl_._h = oh_.a825(hj_._Z, "pieces", "piece_goblin_cleaver");
      tn_._I = oh_.a825(hj_._Z, "pieces", "piece_goblin_club");
      jl_._c = oh_.a825(hj_._Z, "pieces", "piece_goblin_scout");
      bn_._h = oh_.a825(hj_._Z, "pieces", "piece_hellbeast");
      fl_._j = oh_.a825(hj_._Z, "pieces", "piece_imp");
      ub_._j = oh_.a825(hj_._Z, "pieces", "piece_merc");
      fn_._o = oh_.a825(hj_._Z, "pieces", "piece_minotaur");
      g_._Ib = oh_.a825(hj_._Z, "pieces", "piece_necromancer");
      df_._e = oh_.a825(hj_._Z, "pieces", "piece_northman");
      ef_._e = oh_.a825(hj_._Z, "pieces", "piece_ogre");
      kf_._k = oh_.a825(hj_._Z, "pieces", "piece_ork_blademaster");
      lj_._o = oh_.a825(hj_._Z, "pieces", "piece_ork_mace");
      le_._d = oh_.a825(hj_._Z, "pieces", "piece_ork_shaman");
      oo_._c = oh_.a825(hj_._Z, "pieces", "piece_pitdemon");
      cg_._b = oh_.a825(hj_._Z, "pieces", "piece_priest");
      lm_._z = oh_.a825(hj_._Z, "pieces", "piece_rat");
      ii_._H = oh_.a825(hj_._Z, "pieces", "piece_rotworm");
      sp_._a = oh_.a825(hj_._Z, "pieces", "piece_saurus_imp");
      qd_._d = oh_.a825(hj_._Z, "pieces", "piece_saurus_spawn");
      na_._A = oh_.a825(hj_._Z, "pieces", "piece_saurus_warrior");
      dk_._b = oh_.a825(hj_._Z, "pieces", "piece_skeleton");
      n_._b = oh_.a825(hj_._Z, "pieces", "piece_snake");
      hh_._o = oh_.a825(hj_._Z, "pieces", "piece_spectre");
      jf_._f = oh_.a825(hj_._Z, "pieces", "piece_spider");
      DungeonAssault._I = oh_.a825(hj_._Z, "pieces", "piece_spy");
      m_._c = oh_.a825(hj_._Z, "pieces", "piece_thief");
      sp_._d = oh_.a825(hj_._Z, "pieces", "piece_troglodyte");
      gd_._A = oh_.a825(hj_._Z, "pieces", "piece_troll");
      h_._E = oh_.a825(hj_._Z, "pieces", "piece_vampire");
      in_._D = oh_.a825(hj_._Z, "pieces", "piece_witch");
      up_._b = oh_.a825(hj_._Z, "pieces", "piece_zealot");
      gd_._E = oh_.a825(hj_._Z, "", "stat_attack");
      jj_._b = oh_.a825(hj_._Z, "", "stat_defence");
      wl_._d = oh_.a825(hj_._Z, "", "stat_dodge");
      pk_._o = oh_.a825(hj_._Z, "", "stat_sneak");
      tb_._c = oh_.a825(hj_._Z, "", "stat_snare");
      kd_._f = oh_.a825(hj_._Z, "", "stat_detect");
      uj_._c = oh_.a825(hj_._Z, "", "stat_renown");
      ue_._i = kn_.a922(hj_._Z, "", "modifier_icons");
      oh_.a825(hj_._Z, "", "dead_icon");
      rj_._k = oh_.a825(hj_._Z, "", "youarehere");
      fj_._d = kn_.a922(hj_._Z, "", "spy_icon");
      bf_._e = kn_.a922(hj_._Z, "", "sac_icon");
      kh_._r = oh_.a825(hj_._Z, "", "revive_icon");
      hj_._T = oh_.a825(hj_._Z, "", "menu_locked");
      n_._e = pa_.a872(hj_._Z, "", "ingot");
      tb_._a = n_._e.d869();
      fb_._f = n_._e.c869();

      for(var12 = 0; var12 < 2; ++var12) {
         if ((1 & fb_._f._g) != 0) {
            ++fb_._f._g;
         }

         if ((fb_._f._d & 1) != 0) {
            ++fb_._f._d;
         }

         q_ var10000 = fb_._f;
         var10000._g /= 2;
         var10000 = fb_._f;
         var10000._d /= 2;
         byte[] var24 = new byte[fb_._f._d * fb_._f._g];
         var14 = 0;

         for(int var15 = 0; var15 < fb_._f._e; ++var15) {
            for(int var16 = 0; fb_._f._h > var16; ++var16) {
               var24[(fb_._f._b + var16 >> 1) + (var15 + fb_._f._a >> 1) * fb_._f._d] = fb_._f._j[var14++];
            }
         }

         fb_._f._j = var24;
         fb_._f._e = fb_._f._g;
         fb_._f._h = fb_._f._d;
         fb_._f._a = 0;
         fb_._f._b = 0;
      }

      la_._b.a478(new q_[]{fb_._f, rf_.a102(10)}, new int[]{9, 10});
      fl_._i = fn_.a316();
      wm_._h = fl_._i.b125();
      dh_._a = rj_.a373();
      sm_._g = qp_.a749();
      fo_._a = wo_.a028(5, 6, 5, 16744448);
      qp_._a = fo_._a.d125();
      qp_._a.g797();
      i_._v = qp_._a.d125();
      i_._v.g797();
      qi_._i = i_._v.d125();
      qi_._i.g797();
      qe_.a653(gd_._E, jj_._b, wl_._d, pk_._o, tb_._c, kd_._f);
      ao_._n = oh_.a825(hj_._Z, "", "scroll_top");
      rn_._c = oh_.a825(hj_._Z, "", "scroll_bottom");
      _s = oh_.a825(hj_._Z, "", "scroll_tile");
      li_._l = new cn_[9];
      li_._l[0] = oh_.a825(hj_._Z, "", "scroll_top_left");
      li_._l[1] = oh_.a825(hj_._Z, "", "scroll_top_centre");
      li_._l[2] = oh_.a825(hj_._Z, "", "scroll_top_right");
      li_._l[3] = oh_.a825(hj_._Z, "", "scroll_centre_left");
      li_._l[4] = new cn_(li_._l[0]._y, li_._l[0]._v);
      li_._l[4].e797();
      gf_.b050(0, 0, gf_._i, gf_._c, 13619075);
      k_._h.a487(true);
      li_._l[5] = oh_.a825(hj_._Z, "", "scroll_centre_right");
      li_._l[6] = oh_.a825(hj_._Z, "", "scroll_bottom_left");
      li_._l[7] = oh_.a825(hj_._Z, "", "scroll_bottom_centre");
      li_._l[8] = oh_.a825(hj_._Z, "", "scroll_bottom_right");
      kg_._a = oh_.a825(hj_._Z, "", "small_button");
      jn_._n = new lg_(327680, 1310720, 327680, 327680, 65536, 32768, 49152, 24576, 0, -4096, 100, 50);
      int[] var26 = new int[256];

      int var25;
      for(var25 = 0; var25 < 64; ++var25) {
         var26[var25] = 262144 * var25;
      }

      for(var25 = 64; var25 < 192; ++var25) {
         var26[var25] = Short.MIN_VALUE + 512 * var25 + 16711680;
      }

      for(var25 = 192; var25 < 256; ++var25) {
         var26[var25] = 16776960 + (var25 - 192) * 4;
      }

      jn_._n._v._i = var26;
      fp_._d = new tf_(ne_._c, tp_._u, cm_._M);
      na_._w = new tf_(ne_._c, bn_._q, cm_._M);
      cg_._a = new tf_(ne_._c, vd_._c, cm_._M);
      ih_._x = new tf_(ne_._c, c_._e.toUpperCase(), cm_._M);
      bf_._m = new tf_(ne_._c, gk_._K, cm_._M);
      kd_._e = new tf_[ie_._j.length];

      for(var25 = 0; var25 < ie_._j.length; ++var25) {
         kd_._e[var25] = new tf_(db_._v, ie_._j[var25], cm_._M);
      }

      new cn_(gf_._i, gf_._c);
   }

   static final void b423() {
      cd_._b = false;
      ub_._o = null;
      if (qc_._t) {
         a_._n.o150(4210752);
      } else {
         int var0 = hf_._sb;
         if (0 < var0) {
            if (var0 == 1) {
               ub_._o = fb_._g;
            } else {
               ub_._o = jk_.a841(new String[]{Integer.toString(var0)}, hm_._j, 30496);
            }

            ub_._o = nf_.a408(new CharSequence[]{ub_._o, "<br>", qa_._b});
         }

         a_._n.j423((byte)79);
         hl_.a487();
      }

   }

   static final void a150(int var0) {
      if (hh_._s == id_._l) {
         id_._l = null;
      }

      if (0 <= ce_._p && ++ce_._p >= 50) {
         jn_._l = gk_._L;
         ce_._p = -1;
         ui_._a = hc_._b;
      }

      wi_._kb = fa_.a666(ui_._a, hc_._b);
      vf_._w = gk_._L != null ? hh_._p - 100 : 620;
      qc_._w = null == gk_._L ? 480 - wi_._kb >> 1 : ed_._P - (wi_._kb >> 1);
      if (-1 != ce_._p) {
         int var1 = jn_._l != null ? hh_._p - 100 : 620;
         int var2 = jn_._l == null ? 480 - wi_._kb >> 1 : -(wi_._kb >> 1) + ed_._P;
         vf_._w = fa_.a666(var1, vf_._w);
         qc_._w = fa_.a666(var2, qc_._w);
      }

      ti_._A.b599(204 + vf_._w, qc_._w - 28, (byte)4);
      tk_._k.b599(vf_._w - 7, 20 + qc_._w + wi_._kb, (byte)4);
      ec_._n.b599(7 + vf_._w + 200, qc_._w + wi_._kb + 22, (byte)4);
      ti_._A._w = null != gk_._L;
      tk_._k._w = var0 < fc_._d;
      ec_._n._w = fc_._d < uo_._f.length - 1;
   }

   static final void a423() {
      h_[] var0 = hp_._b;

      int var1;
      for(var1 = 0; var0.length > var1; ++var1) {
         h_ var2 = var0[var1];
         if (null != var2) {
            if (var2._e != null) {
               var2._e.a423((byte)-19);
            }

            if (var2._u != null) {
               var2._u.a423((byte)-19);
            }

            if (null != var2._t) {
               var2._t.a423((byte)-19);
            }

            if (null != var2._v) {
               var2._v.a423((byte)-19);
            }

            if (null != var2._l) {
               var2._l.a423((byte)-19);
            }
         }
      }

      ac_[] var3 = gh_._i;

      for(var1 = 0; var3.length > var1; ++var1) {
         ac_ var4 = var3[var1];
         if (var4 != null) {
            if (var4._d != null) {
               var4._d.a423((byte)-19);
            }

            if (var4._u != null) {
               var4._u.a423((byte)-19);
            }

            if (var4._m != null) {
               var4._m.a423((byte)-19);
            }
         }
      }

      System.gc();
   }

   static final cn_ a091(int var0, int var1) {
      cn_ var2 = new cn_(var1, var1);

      for(int var3 = 0; var2._B.length > var3; ++var3) {
         var2._B[var3] = var0;
      }

      return var2;
   }

   static final ai_ a167(boolean var0, ec_ var1, boolean var2) {
      if (var2) {
         a167(false, (ec_)null, true);
      }

      int var3 = var1.c474(true);
      ai_ var4 = new ai_(var3);
      var4._p = var1.c474(true);
      var4._g = var1.c474(true);
      var4._r = var1.c474(true);
      var4._q = var1.c474(true);
      if (!var0) {
         var4._j = var1.c474(true);
         var4._l = var1.c474(true);
         var4._s = var1.c474(!var2);
         var4._o = var1.c474(true);
      }

      return var4;
   }
}
