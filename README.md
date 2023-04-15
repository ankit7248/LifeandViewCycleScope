<h1>LifeCycleScope</h1>
<p>A LifecycleScope is defined for each Lifecycle object. Any coroutine launched in this scope is canceled when the Lifecycle is destroyed. You can access the CoroutineScope of the Lifecycle either via lifecycle.coroutineScope or lifecycleOwner.lifecycleScope properties.</p>

<hr>
<h1>ViewModelScope</h1>
<p> A ViewModelScope is defined for each ViewModel in your app. Any coroutine launched in this scope is automatically canceled if the ViewModel is cleared. Coroutines are useful here for when you have work that needs to be done only if the ViewModel is active. For example, if you are computing some data for a layout, you should scope the work to the ViewModel so that if the ViewModel is cleared, the work is canceled automatically to avoid consuming resources.

You can access the CoroutineScope of a ViewModel through the viewModelScope property of the ViewModel, as shown in the following example:</p>

