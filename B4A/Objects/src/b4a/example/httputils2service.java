package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ReceiverHelper;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends android.content.BroadcastReceiver{
		
    static httputils2service mostCurrent;
	public static BA processBA;
    private ReceiverHelper _receiver;
    private static boolean firstTime = true;
    public static Class<?> getObject() {
		return httputils2service.class;
	}
	@Override
	public void onReceive(android.content.Context context, android.content.Intent intent) {
        mostCurrent = this;
       
        if (processBA == null) {
           
		    processBA = new anywheresoftware.b4a.ShellBA(context, null, null, anywheresoftware.b4a.BA.SharedProcessBA.ModuleType.RECEIVER, "b4a.example.httputils2service");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
        }
         _receiver = new ReceiverHelper(this);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.httputils2service", processBA, _receiver, anywheresoftware.b4a.keywords.Common.Density);
		}
        processBA.setActivityPaused(false);
        BA.LogInfo("*** Receiver (httputils2service) Receive " + (firstTime ? "(first time)" : "") + " ***");
        anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
        iw.setObject(intent);
        processBA.raiseEvent(null, "receiver_receive", firstTime, iw);
        firstTime = false;
    }
	

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "completejob", false))
	 {return ((String) Debug.delegate(processBA, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("511665414","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=11665425;
 //BA.debugLineNum = 11665425;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("511599874",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("511599879","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("511468803","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(processBA,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Service_Create";
_service_create();
 };
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="TempFolder = File.DirInternalCache";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Try";
try {RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
anywheresoftware.b4a.keywords.Common.File.WriteString(_tempfolder,"~test.test","test");
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_tempfolder,"~test.test");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511141127",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Log(\"Switching to File.DirInternal\")";
anywheresoftware.b4a.keywords.Common.LogImpl("511141128","Switching to File.DirInternal",0);
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="TempFolder = File.DirInternal";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=11141147;
 //BA.debugLineNum = 11141147;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=11141149;
 //BA.debugLineNum = 11141149;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "response_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4a.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "submitjob", false))
	 {return ((String) Debug.delegate(processBA, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="End Sub";
return "";
}
}