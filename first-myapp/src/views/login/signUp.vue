<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>SIGNUP</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
<!--      <SignUpContainer name="SIGNUP" />-->

      <div  class="container register-form">
        <div class="form">
          <div class="note">
            <p>회원가입 페이지</p>
          </div>

          <div class="form-content">
            <div class="row">
              <div class="col-md-6">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="아이디 *" value=""/>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="핸드폰번호 *" value=""/>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="핸드폰인증 *" value=""/>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="패스워드 *" value=""/>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="패스워드 확인 *" value=""/>
                </div>
                <div class="form-group">
                  <select name="" id="" class="form-control"  value="">
                    <option value="" selected>앱에서 사용할 직업</option>
                    <option value="">회사원</option>
                    <option value="">공무원</option>
                    <option value="">군인</option>
                    <option value="">사업가</option>
                  </select>
                </div>
                <div class="form-group">
                  <select name="" id="" class="form-control"  value="">
                    <option value="" selected>앱에서 사용할 특성-</option>
                    <option value="">인내</option>
                    <option value="">성장</option>
                    <option value="">의지</option>
                    <option value="">우위</option>
                    <option value="">보상</option>
                  </select>
                </div>
              </div>
            </div>


          </div>
          <div class="form-content">
            <div class="row">
              <div class="col-md-6">

              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="개인정보 처리방침 *" value=""/>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="개인정보 처리방침2 *" value=""/>
                </div>
              </div>
            </div>
            <button type="button" class="btnSubmit" v-on:click="back">뒤로가기</button>
            <button type="button" class="btnSubmit">완료</button>
          </div>
        </div>
      </div>

    </ion-content>
  </ion-page>
</template>
<script>
import ExploreContainer from "../../components/ExploreContainer";
import {IonContent, IonHeader, IonPage, IonTitle, IonToolbar} from "@ionic/vue";
import '../../css/signUp.css'
import SignUpContainer  from '@/components/com_signUp.vue';
import * as $ from 'jquery'
export default {
  name: "signUp",
   components: { IonContent, IonHeader, IonToolbar, IonTitle, IonPage },
  methods:{
    back() {
      window.location.replace('/login')
    },

  }
}
</script>

<style scoped>

</style>