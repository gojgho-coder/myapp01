<template>

    <div  class="container register-form">
      <div class="form">
        <div class="note">
          <p>회원가입 페이지</p>
        </div>

        <div class="form-content">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="ID *" value=""/>
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
                <input type="text" class="form-control" placeholder="Password *" value=""/>
              </div>
              <div class="form-group">
                <input type="text" class="form-control" placeholder="Confirm Password *" value=""/>
              </div>
              <div class="form-group">
                <select name="" id="" class="form-control"  value="">
                  <option value="" selected>-------------------Your App Work Choice-------------------</option>
                  <option value="">회사원</option>
                  <option value="">공무원</option>
                  <option value="">군인</option>
                  <option value="">사업가</option>
                </select>
              </div>
              <div class="form-group">
                <select name="" id="" class="form-control"  value="">
                  <option value="" selected>-------------------------Characteristic-------------------------</option>
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
          <button type="button" class="btnSubmit" v-on:click="back">Back</button>
          <button type="button" class="btnSubmit">Submit</button>
        </div>
      </div>
    </div>

</template>
<script>
import '../css/signUp.css'
export default {
name: "com_signUp",
  methods:{
    back() {
      history.back();
    },

  }
}
</script>

<style scoped>

</style>