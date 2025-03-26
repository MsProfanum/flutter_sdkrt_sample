import 'package:flutter/material.dart';
import 'package:new_flutter_sample_with_sdkrt/sdk_method_channel.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  late final SdkMethodChannel methodChannel;

  MyHomePage({super.key}) {
    methodChannel = SdkMethodChannel();
  }

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Widget _initializedSdkWidget = Text("");
  Widget _sdkWidget = SizedBox.shrink();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            _initializedSdkWidget,
            ElevatedButton(
              onPressed: () async {
                final newSdkWidget = await widget.methodChannel.initializeSdk();
                setState(() {
                  _initializedSdkWidget = newSdkWidget;
                });
              },
              child: Text('Initialize SDK'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () async {
                final newSdkWidget = await widget.methodChannel.createFile();
                setState(() {
                  _sdkWidget = newSdkWidget;
                });
              },
              child: Text('Create file'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () async {
                final newSdkWidget = await widget.methodChannel.loadBannerAd();
                setState(() {
                  _sdkWidget = newSdkWidget;
                });
              },
              child: Text('Load banner ad'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () async {
                await widget.methodChannel.showFullscreenAd();
              },
              child: Text('Show fullscreen ad'),
            ),
            SizedBox(height: 20),
            _sdkWidget,
          ],
        ),
      ),
    );
  }
}
